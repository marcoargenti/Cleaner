package cloud.benchflow.cleaner;

import java.security.Provider;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.*;
import org.jooq.impl.*;

import cleandb.cleanrawdata.tables.Construct;
import schema.process_engine.tables.ActHiActinst;
import schema.process_engine.tables.ActHiProcinst;
import schema.process_engine.tables.records.ActHiActinstRecord;
import schema.process_engine.tables.records.ActHiProcinstRecord;
import schema.process_engine.tables.records.ActHiTaskinstRecord;

public abstract class DBCleaner extends Cleaner {

	DB sourceDB;
	Map mappingProcess;
	Map mappingConstruct;
	private String seed;

	public DBCleaner(String destinationUser, String destinationPassword, String destinationUrl, String sourceUrl, String sourceUser, String sourcePassword, String experimentID, int repetitionNum){
		super(destinationUser, destinationPassword, destinationUrl, sourceUrl, experimentID, repetitionNum);
		
		connectToSourceData(sourceUser, sourcePassword, sourceUrl);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSSSS");
		java.util.Date date = new java.util.Date();
		seed = dateFormat.format(date) + this.experimentID + this.repetitionNum;
		
		mappingProcess = new HashMap();
		mappingConstruct = new HashMap();
		
	}
	
	/**
	 * connectToSourceData method connects the object to the database specified as source DB.
	 * 
	 * @param sourceUser
	 * @param sourcePassword
	 * @param sourceUrl must be formated correctly according URL requirements
	 */
	void connectToSourceData(String sourceUser, String sourcePassword, String sourceUrl){
		try {
			sourceDB = new DB( sourceUser, sourcePassword, sourceUrl);
			} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	protected String getSeed() {
		return seed;
	}

	/**
	 * selectData method selects the data from the source database inside the table.
	 * 
	 * @param table is the table from which data must be selected
	 * @return the records selected
	 */
	Result<?> selectData(TableLike<?> table){
		Connection sourceConn = sourceDB.connectDB();

		SelectJoinStep<Record> retSQL = null;

		DSLContext database = DSL.using(sourceConn, SQLDialect.MYSQL);
		retSQL = database.select().from(table);

		Result<?> result = retSQL.fetch();
		
		try {
			sourceConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


		return result;
	}

	/**
	 * convertTimestampToDatetime converts a sql timestamp to a sql datetime.
	 * 
	 * @param timestampDate is a sql timestamp
	 * @return an sql datetime
	 */
	String convertTimestampToDatetime(Timestamp timestampDate){
		SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
		
		String datetime = sdf.format(timestampDate);
//		Timestamp timestampFormat = new Timestamp(Timestamp.parse(datetime));
		return datetime;
	}
	
	/**
	 * computeDuration computes the time interval between two time.
	 * 
	 * @param start is the start time
	 * @param end is the end time
	 * @return duration
	 */
	Long computeDuration(Timestamp start, Timestamp end){
		Long duration = end.getTime() - start.getTime();
		
		return duration;
	}
	
	/**
	 * computeEndTime computes end time.
	 * 
	 * @param start is the start time
	 * @param duration is a time interval
	 * @return end time
	 */
	Timestamp computeEndTime(Timestamp start, Long duration){
		Timestamp end;
		Long endTimeLong = start.getTime() + duration;
		end = new Timestamp(endTimeLong);
		
		return end;
	}
	
	/**
	 * fillMap method fills mappingProcess and mappingConstruct according couple (clean field, raw data field)
	 */
	void fillMap(){
		fillMapProcess();
		fillMapConstruct();
	}
	
	/**
	 * fillMapProcess method fills the mappingProcess according couple (clean field, raw data field)
	 */
	abstract void fillMapConstruct();
	
	/**
	 * fillMapProcess method fills the mappingConstruct according couple (clean field, raw data field)
	 */
	abstract void fillMapProcess();
	
	/**
	 * tranformProcessInstanceID method creates a process instance ID.
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return a process instance ID
	 */
	byte[] tranformProcessInstanceID(Record inputRecord, Field sourceField){
		String sourceProcessID = (String) inputRecord.getValue(sourceField);
		
		byte[] instanceID = getBinaryID( sourceProcessID + seed  );
		return instanceID;
	}
	
	/**
	 * tranformSourceProcessInstanceID converts the source process instance ID to be stored in the clean database
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return converted source process instance ID
	 */
	String tranformSourceProcessInstanceID(Record inputRecord, Field sourceField){
		String sourceProcessID = (String) inputRecord.getValue(sourceField);
		String destProcessID = sourceProcessID;
		
		return destProcessID;
	}
	
	/**
	 * tranformProcessModelID converts the source process model ID to be stored in the clean database
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return converted source process model ID
	 */
	String tranformProcessModelID(Record inputRecord, Field sourceField){
		String sourceProcessModelID = (String) inputRecord.getValue(sourceField);
		
		String destProcessModelID = sourceProcessModelID ;
		return destProcessModelID;
	}
	
	/**
	 * tranformDuration converts duration to be stored in the clean database
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return converted duration
	 */
	Long tranformDuration(Record inputRecord , Field inputField){
		Long sourceDuration = (Long) inputRecord.getValue(inputField);
		Long destDuration = sourceDuration;
		return destDuration;
	}
	
	/**
	 * tranformEndtime converts end time to be stored in the clean database
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return converted end time
	 */
	Timestamp tranformEndtime(Record inputRecord, Field inputField){
		Timestamp sourceEndtime = (Timestamp) inputRecord.getValue(inputField);
		
		Timestamp destEndtime = sourceEndtime;
		return destEndtime;
	}
	
	/**
	 * tranformStarttime converts start time to be stored in the clean database
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return converted start time
	 */
	Timestamp tranformStarttime(Record inputRecord, Field inputField){
		Timestamp sourceStarttime = (Timestamp) inputRecord.getValue(inputField);
		
		Timestamp destStarttime = sourceStarttime;
		return destStarttime;
	}
	
	/**
	 * tranformStarttime identifies the construct type to be stored in the clean database for construct instance
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return construct type
	 */
	@SuppressWarnings("unchecked")
	String tranformConstructType( Record inputRecord, Field inputField ){
		String constructType = null;
		String sourceConstructType = (String) inputRecord.getValue(inputField);
		sourceConstructType =sourceConstructType.toLowerCase();
		
		if( sourceConstructType.matches(".*event.*") ){
			constructType = "event";
		} else if( sourceConstructType.matches(".*timer.*") ){
			constructType = "event";
		} else 	if( sourceConstructType.matches(".*gateways.*") ){
			constructType = "gateways";
		} else if( sourceConstructType.matches(".*data.*") ){
			constructType = "data";
		} else if( sourceConstructType.matches(".*pool.*") ){
			constructType = "swimline";
		} else if( sourceConstructType.matches(".*lane.*") ){
			constructType = "swimline";
		} else if( sourceConstructType.matches(".*swimline.*") ){
			constructType = "swimline";
		} else if( sourceConstructType.matches(".*task.*") ){
			constructType = "task";
		}
		
		return constructType;
	}
	
	/**
	 * tranformConstructInstanceID method creates a construct instance ID.
	 * 
	 * @param inputRecord is the raw record from which data must be extracted
	 * @param sourceField is the field to get from inputRecord for the transformation; 
	 * 		so it is the field name of value that must be analyzed in the raw record.
	 * 
	 * @return a construct instance ID
	 */
	byte[] tranformConstructInstanceID( ActHiActinstRecord inputRecord, Field inputField ){
		
		String sourceProcessID = (String) inputRecord.getValue(inputField);
		
		byte[] instanceID = getBinaryID( sourceProcessID + seed  );
		return instanceID;
	}
}
