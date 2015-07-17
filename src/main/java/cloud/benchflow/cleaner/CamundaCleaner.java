package cloud.benchflow.cleaner;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.DataFormatException;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.SelectJoinStep;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import schema.process_engine.tables.ActHiActinst;
import schema.process_engine.tables.ActHiProcinst;
import schema.process_engine.tables.records.ActHiActinstRecord;
import schema.process_engine.tables.records.ActHiProcinstRecord;
import cleandb.cleanrawdata.tables.*;
import cleandb.cleanrawdata.tables.Process;
import cleandb.cleanrawdata.tables.records.ConstructRecord;
import cleandb.cleanrawdata.tables.records.EnvironmentdataRecord;
import cleandb.cleanrawdata.tables.records.ProcessRecord;

public class CamundaCleaner extends DBCleaner {

	public CamundaCleaner(String destinationUser, String destinationPassword,
			String destinationUrl, String sourceUrl, String sourceUser,
			String sourcePassword, String experimentID,
			int repetitionNum) {
		super(destinationUser, destinationPassword, destinationUrl, sourceUrl,
				sourceUser, sourcePassword,  experimentID, repetitionNum);
		
		fillMap();
	}

	public static void main(String[] args) {
		String sourceUser = "root";
		String sourcePassword = "root";
//		String sourceUrl = "jdbc:mysql://195.176.181.45:13020/process-engine";
		String sourceUrl = "jdbc:mysql://192.168.59.103:13011/process_engine";
		String destUser = "root";
		String destPassword = "root";
//		String destUrl = "jdbc:mysql://195.176.181.45:13000/CleanRawData";
		String destUrl = "jdbc:mysql://192.168.59.103:13000/CleanRawData";
		String experimentID = "exp20mila";
		int repetition = 1;
		
		
//		for(int i = 0; i<5; i++){
		CamundaCleaner cc = new CamundaCleaner(destUser, destPassword, destUrl, sourceUrl, sourceUser, sourcePassword, experimentID, repetition);
		
		cc.clean();
//		}
		
	}
	
	

	void clean(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd | HH:mm:ss.SSSSSS");
		Date dateStartSelectCostruct, dateStartTransfCostruct, dateStartStoreCostruct;
		Date dateEndSelectCostruct, dateEndTransfCostruct, dateEndStoreCostruct;

		Thread threadProcess = new Thread() { 
			@Override 
			public void run() {
				treatProcess();
			}
		};
		threadProcess.start();

		//start activity
		dateStartSelectCostruct = new Date();
		Result<ActHiActinstRecord> sourceActivityRecord = (Result<ActHiActinstRecord>) selectData( ActHiActinst.ACT_HI_ACTINST );
		
		dateStartTransfCostruct = new Date();
		Result<ConstructRecord> destConstructRecord = transformConstruct( sourceActivityRecord );
		dateEndTransfCostruct = new Date();

		try {
			threadProcess.join();
		} catch (Exception e) {
			System.err.println("Process error in thread");
			e.printStackTrace();
		}
		dateStartStoreCostruct = new Date();
		storeCleanData(Construct.CONSTRUCT, destConstructRecord);

		dateEndStoreCostruct = new Date();
		
		dateEndSelectCostruct = dateStartTransfCostruct;

		System.out.println( "Start_select_Costruct |" + dateFormat.format(dateStartSelectCostruct) );
		System.out.println( "End_select_Costruct |" + dateFormat.format(dateEndSelectCostruct) );
		System.out.println( "Start_transf_Costruct |" + dateFormat.format(dateStartTransfCostruct) );
		System.out.println( "End_transf_Costruct |" + dateFormat.format(dateEndTransfCostruct) );
		System.out.println( "Start_store_Costruct |" + dateFormat.format(dateStartStoreCostruct) );
		System.out.println( "End_store_Costruct |" + dateFormat.format(dateEndStoreCostruct) );
		System.out.println( );
		System.out.println("Numero_processi_dal_Source_DB | " + sourceActivityRecord.size() );
		System.out.println("Numero_processi_per_Destination_DB | " + destConstructRecord.size() );
		
		long timeSelect = dateEndSelectCostruct.getTime() - dateStartSelectCostruct.getTime();
		long timeTransf = dateEndTransfCostruct.getTime() - dateStartTransfCostruct.getTime();
		long timeStore = dateEndStoreCostruct.getTime() - dateStartStoreCostruct.getTime();
		
		System.out.println("Dif constr select in ms | " + timeSelect);
		System.out.println("Dif constr trasf in ms | " + timeTransf);
		System.out.println("Dif constr store in ms | " + timeStore);
		
		double number = (double) destConstructRecord.size();
		
		System.out.println("Dif constr select in ms | " + number/timeSelect);
		System.out.println("Dif constr trasf in ms | " + number/timeTransf);
		System.out.println("Dif constr store in ms | " + number/timeStore);
	}

	/**
	 * treatProcess method proceeds with the cleaning of the data regarding process instances. 
	 * It consist of selection of raw data, transformation of raw data into clean data and storing of clean data.
	 */
	void treatProcess(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd | HH:mm:ss.SSSSSS");
		Date dateStartSelectProcess, dateStartTransfProcess, dateStartStoreProcess;
		Date dateEndSelectProcess, dateEndTransfProcess, dateEndStoreProcess;

		dateStartSelectProcess = new Date();
		Result<ActHiProcinstRecord> sourceProcessRecord = (Result<ActHiProcinstRecord>) selectData( ActHiProcinst.ACT_HI_PROCINST );

		dateStartTransfProcess = new Date();
		Result<ProcessRecord> destProcessRecord = transformProcess( sourceProcessRecord );

		dateStartStoreProcess = new Date();
		storeCleanData(Process.PROCESS, destProcessRecord);
		dateEndStoreProcess = new Date();

		dateEndSelectProcess = dateStartTransfProcess;
		dateEndTransfProcess = dateStartStoreProcess;

		System.out.println( "Start_select_Process |" + dateFormat.format(dateStartSelectProcess) );
		System.out.println( "End_select_Process |" + dateFormat.format(dateEndSelectProcess) );
		System.out.println( "Start_transf_Process |" + dateFormat.format(dateStartTransfProcess) );
		System.out.println( "End_transf_Process |" + dateFormat.format(dateEndTransfProcess) );
		System.out.println( "Start_store_Process |" + dateFormat.format(dateStartStoreProcess) );
		System.out.println( "End_store_Process |" + dateFormat.format(dateEndStoreProcess) );
		System.out.println( );
		System.out.println("Numero_processi_dal_Source_DB | " + sourceProcessRecord.size() );
		System.out.println("Numero_processi_per_Destination_DB | " + destProcessRecord.size() );
		
		long timeSelect = dateEndSelectProcess.getTime() - dateStartSelectProcess.getTime();
		long timeTransf = dateEndTransfProcess.getTime() - dateStartTransfProcess.getTime();
		long timeStore = dateEndStoreProcess.getTime() - dateStartStoreProcess.getTime();
		
		System.out.println("Dif proc select in ms | " + timeSelect);
		System.out.println("Dif proc trasf in ms | " + timeTransf);
		System.out.println("Dif proc store in ms | " + timeStore);
		
		double number = (double) destProcessRecord.size();
		
		System.out.println("Dif proc select in ms | " + number/timeSelect);
		System.out.println("Dif proc trasf in ms | " + number/timeTransf);
		System.out.println("Dif proc store in ms | " + number/timeStore);
	}
	
//	/**
//	 * clean method proceeds with the cleaning of the data regarding process instances and constructs. 
//	 * It consist of selection of raw data, transformation of raw data into clean data and storing of clean data.
//	 */
//	void clean(){
//		
//		Thread threadProcess = new Thread() { 
//			@Override 
//			public void run() {
//				treatProcess();
//			}
//		};
//		threadProcess.start();
//		
//		//start activity
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSSSS");
//		Date date = new Date();
//		
//		System.out.println( "Start select Act" + dateFormat.format(date) );
//		Result<ActHiActinstRecord> sourceActivityRecord = (Result<ActHiActinstRecord>) selectData( ActHiActinst.ACT_HI_ACTINST );
//		
//		date = new Date();
//		System.out.println( "Start transf Act" + dateFormat.format(date) );
//		
////		Result<ConstructRecord> destConstructRecord = transformConstruct( sourceActivityRecord, ActHiActinst.ACT_HI_ACTINST );
//		Result<ConstructRecord> destConstructRecord = transformConstruct( sourceActivityRecord );
//		
//		date = new Date();
//		System.out.println( "Wait complition store Process" + dateFormat.format(date) );
//		
//		try {
//			threadProcess.join();
//		} catch (Exception e) {
//			System.err.println("Process error in thread");
//			e.printStackTrace();
//		}
//		//start store construct
//		date = new Date();
//		System.out.println( "Start store Construct" + dateFormat.format(date) );
//		storeCleanData(Construct.CONSTRUCT, destConstructRecord);
//		
//		date = new Date();
//		System.out.println( "End store Construct" + dateFormat.format(date) );
//	}
//
//	/**
//	 * treatProcess method proceeds with the cleaning of the data regarding process instances. 
//	 * It consist of selection of raw data, transformation of raw data into clean data and storing of clean data.
//	 */
//	void treatProcess(){
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSSSS");
//		Date date = new Date();
//		
//		System.out.println( "Start select Process" + dateFormat.format(date) );
//		Result<ActHiProcinstRecord> sourceProcessRecord = (Result<ActHiProcinstRecord>) selectData( ActHiProcinst.ACT_HI_PROCINST );
//		
//		date = new Date();
//		System.out.println( "Start transf Process" + dateFormat.format(date) );
//		Result<ProcessRecord> destProcessRecord = transformProcess( sourceProcessRecord );
//		
//		date = new Date();
//		System.out.println( "Start store Process" + dateFormat.format(date) );
//		storeCleanData(Process.PROCESS, destProcessRecord);
//		
//		date = new Date();
//		System.out.println( "end Process" + dateFormat.format(date) );
//	}
	
//	/**
//	 * treatActivity method proceeds with the cleaning of the data regarding construct. 
//	 * It consist of selection of raw data, transformation of raw data into clean data and storing of clean data.
//	 */
//	void treatActivity(){
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSSSS");
//		Date date = new Date();
//		
//		System.out.println( "Start select Act" + dateFormat.format(date) );
//		Result<ActHiActinstRecord> sourceActivityRecord = (Result<ActHiActinstRecord>) selectData( ActHiActinst.ACT_HI_ACTINST );
//		
//		date = new Date();
//		System.out.println( "Start transf Act" + dateFormat.format(date) );
//		
//		Result<ConstructRecord> destActivityRecord = transformConstruct( sourceActivityRecord, ActHiActinst.ACT_HI_ACTINST );
//		
//		date = new Date();
//		System.out.println( "Start store Act" + dateFormat.format(date) );
//		storeCleanData(Construct.CONSTRUCT, destActivityRecord);
//		
//		date = new Date();
//		System.out.println( "end Act" + dateFormat.format(date) );
//	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	void fillMapConstruct() {
		Map tableActivity = new HashMap();
		tableActivity.put(Construct.CONSTRUCT.CONSTRUCTID, ActHiActinst.ACT_HI_ACTINST.ID_);
		tableActivity.put(Construct.CONSTRUCT.CONSTRUCTNAME, ActHiActinst.ACT_HI_ACTINST.ACT_NAME_);
		tableActivity.put(Construct.CONSTRUCT.CONSTRUCTTYPE, ActHiActinst.ACT_HI_ACTINST.ACT_TYPE_);
		tableActivity.put(Construct.CONSTRUCT.DURATION, ActHiActinst.ACT_HI_ACTINST.DURATION_);
		tableActivity.put(Construct.CONSTRUCT.ENDTIME, ActHiActinst.ACT_HI_ACTINST.END_TIME_);
		tableActivity.put(Construct.CONSTRUCT.STARTTIME, ActHiActinst.ACT_HI_ACTINST.START_TIME_);
		tableActivity.put(Construct.CONSTRUCT.PROCESSINSTANCEID, ActHiActinst.ACT_HI_ACTINST.PROC_INST_ID_);
		tableActivity.put(Construct.CONSTRUCT.SOURCECONSTRUCTID, ActHiActinst.ACT_HI_ACTINST.ID_);

		mappingConstruct.put( ActHiActinst.ACT_HI_ACTINST , tableActivity);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	/**
	 * transformConstruct method proceeds with the transformation of the data regarding construct. 
	 * In particular it regards the transformation of raw data into clean data.
	 * 
	 * @param input is the set of record in the table fromTable
	 * @param fromTable is the table from which the input parameter has been obtained
	 * @return set of clean data of constructs
	 */
	//TODO visibility public  per test
	public Result<ConstructRecord> transformConstruct( Result<?> input ) {
		
		DSLContext dbContext = initializeDBContext(getDestDB(), SQLDialect.MYSQL);
		Result<ConstructRecord> ret = initializeResult(dbContext, Construct.CONSTRUCT);

		//		if(fromTable.equals( ActHiActinst.ACT_HI_ACTINST ) ){
		Iterator<ActHiActinstRecord> inputIterator = ( Iterator<ActHiActinstRecord> ) input.iterator();
		while( inputIterator.hasNext() ){
			ActHiActinstRecord inputRecord = inputIterator.next();

			ConstructRecord recordToAdd = null;
			recordToAdd = (ConstructRecord) dbContext.newRecord(Construct.CONSTRUCT);
			Field<?>[] fields = recordToAdd.fields();
			for(Field field: fields){
				Object valueToStore = null;

				valueToStore = convertActivityValue(field, inputRecord);

				recordToAdd.setValue(field, valueToStore);
			}

			ret.add( recordToAdd );
		}
		//		}
		return ret;
	}
	
	/**
	 * convertProcessValue method proceeds with the transformation of a field regarding activities. 
	 * In particular it regards the transformation of raw data into clean data.
	 * 
	 * @param field is the field name of value that must be analyzed in the raw record.
	 * @param inputRecord is the raw record from which value of field must be extracted.
	 * @return clean value of the field in the raw record
	 */
	@SuppressWarnings("rawtypes")
	Object convertActivityValue(Field field, ActHiActinstRecord inputRecord){
		Object ret = null;
		Map mappingActivity = (Map) mappingConstruct.get(ActHiActinst.ACT_HI_ACTINST);
		Field inputField = (Field) mappingActivity.get(field);
		
		if( field.equals(Construct.CONSTRUCT.CONSTRUCTID) ){
			ret = (Object) tranformConstructInstanceID( inputRecord, inputField );
		} else if ( field.equals( Construct.CONSTRUCT.CONSTRUCTTYPE ) ){
			inputField = (Field) mappingActivity.get(Construct.CONSTRUCT.CONSTRUCTTYPE);
			ret = (Object) tranformConstructType(inputRecord, inputField);
		} else if( field.equals( Construct.CONSTRUCT.SOURCECONSTRUCTID ) ){
			ret = (Object) tranformSourceProcessInstanceID(inputRecord, inputField);
		} else if( field.equals( Construct.CONSTRUCT.PROCESSINSTANCEID ) ){
			ret = (Object) tranformProcessInstanceID(inputRecord, inputField);
		} else if( field.equals( Construct.CONSTRUCT.DURATION ) ){
			ret = (Object) tranformDuration(inputRecord, inputField);
		} else if( field.equals( Construct.CONSTRUCT.ENDTIME ) ){
			ret = (Object) tranformEndtime(inputRecord, inputField);
		} else if( field.equals( Construct.CONSTRUCT.STARTTIME ) ){
			ret = (Object) tranformStarttime(inputRecord, inputField);
		} else if(field.equals( Construct.CONSTRUCT.CONSTRUCTNAME ) ){
			ret = (Object) tranformConstructName(inputRecord);	
		}
		
		return ret;
	}
	
	/**
	 * @return return a string that allow to identify the construct model. 
	 * So construct of process instances from the same process model will have same constructName.
	 */
	String tranformConstructName(ActHiActinstRecord inputRecord){
		String sourceConstructName = (String) inputRecord.getValue(ActHiActinst.ACT_HI_ACTINST.ACT_NAME_);
		String sourceConstructID = (String) inputRecord.getValue(ActHiActinst.ACT_HI_ACTINST.ACT_ID_);
		
		String destConstructName = sourceConstructID + sourceConstructName ;
		return destConstructName;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	void fillMapProcess(){
		mappingProcess.put(Process.PROCESS.PROCESSINSTANCEID, ActHiProcinst.ACT_HI_PROCINST.PROC_INST_ID_);
		mappingProcess.put(Process.PROCESS.PROCESSMODELID, ActHiProcinst.ACT_HI_PROCINST.PROC_DEF_ID_);
		mappingProcess.put(Process.PROCESS.SOURCEPROCESSINSTANCEID, ActHiProcinst.ACT_HI_PROCINST.PROC_INST_ID_);
		
		mappingProcess.put(Process.PROCESS.DURATION, ActHiProcinst.ACT_HI_PROCINST.DURATION_);
		mappingProcess.put(Process.PROCESS.ENDTIME, ActHiProcinst.ACT_HI_PROCINST.END_TIME_);
		mappingProcess.put(Process.PROCESS.STARTTIME, ActHiProcinst.ACT_HI_PROCINST.START_TIME_);
	}
	
	/**
	 * transformProcess method proceeds with the transformation of the data regarding process instances. 
	 * In particular it regards the transformation of raw data into clean data.
	 * 
	 * @param input is the set of raw record to clean
	 * @return set of clean data of process instances
	 */
	//TODO public for testing
	public Result<ProcessRecord> transformProcess(Result<ActHiProcinstRecord> input){
		DSLContext dbContext = initializeDBContext(getDestDB(), SQLDialect.MYSQL);
		Result<ProcessRecord> ret = initializeResult(dbContext, Process.PROCESS);
		
		Iterator<ActHiProcinstRecord> inputIterator = input.iterator();
		while( inputIterator.hasNext() ){
			ActHiProcinstRecord inputRecord = inputIterator.next();
			
			ProcessRecord recordToAdd = null;
			recordToAdd = (ProcessRecord) dbContext.newRecord( Process.PROCESS);
			Field<?>[] fields = recordToAdd.fields();
			for(Field field: fields){
				Object valueToStore = null;
				
				valueToStore = convertProcessValue(field, inputRecord);
				
				recordToAdd.setValue(field, valueToStore);
			}
			recordToAdd.setValue(Process.PROCESS.TRIALID, trialID ); //TODO also per construct
			
			ret.add( recordToAdd );
		}
		return ret;
		
	}
	
	/**
	 * convertProcessValue method proceeds with the transformation of a field regarding process instances. 
	 * In particular it regards the transformation of raw data into clean data.
	 * 
	 * @param field is the field name of value that must be analyzed in the raw record.
	 * @param inputRecord is the raw record from which value of field must be extracted.
	 * @return clean value of the field in the raw record
	 */
	Object convertProcessValue(Field field, ActHiProcinstRecord inputRecord){
		Object ret = null;
		Field inputField = (Field) mappingProcess.get(field);
		
		if( field.equals(Process.PROCESS.PROCESSINSTANCEID) ){
			ret = (Object) tranformProcessInstanceID(inputRecord, inputField);
		} else if( field.equals( Process.PROCESS.PROCESSMODELID ) ){
			ret = (Object) tranformProcessModelID(inputRecord, inputField);
		} else if( field.equals( Process.PROCESS.SOURCEPROCESSINSTANCEID ) ){
			ret = (Object) tranformSourceProcessInstanceID(inputRecord, inputField);
		} else if( field.equals( Process.PROCESS.DURATION ) ){
			ret = (Object) tranformDuration(inputRecord, inputField);
		} else if( field.equals( Process.PROCESS.ENDTIME ) ){
			ret = (Object) tranformEndtime(inputRecord, inputField);
		} else if( field.equals( Process.PROCESS.STARTTIME ) ){
			ret = (Object) tranformStarttime(inputRecord, inputField);
		}
		
		return ret;
	}
	
	

}
