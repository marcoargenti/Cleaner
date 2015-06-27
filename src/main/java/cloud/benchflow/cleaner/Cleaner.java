package cloud.benchflow.cleaner;


import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

import org.jooq.*;
import org.jooq.impl.*;

import cleandb.cleanrawdata.tables.Construct;
import cleandb.cleanrawdata.tables.Environmentdata;
import cleandb.cleanrawdata.tables.Experiment;
import cleandb.cleanrawdata.tables.records.ConstructRecord;
import cleandb.cleanrawdata.tables.records.EnvironmentdataRecord;
import cleandb.cleanrawdata.tables.records.ExperimentRecord;


public abstract class Cleaner {
//	String destUser = "root";
//	String destPassword = "root";
//	String destUrl = "jdbc:mysql://192.168.59.103:13011/process-engine";
	DB destDB;
	String sourceUrl;
	byte[] trialID;
	String experimentID;
	int repetitionNum;

	/**
	 * It is the constructor of Cleaner objects and insert the record about the experiment in the table Experiment.
	 * 
	 * @param destinationUser
	 * @param destinationPassword
	 * @param destinationUrl must be formated correctly according URL requirements
	 * @param sourceUrl
	 * @param experimentID
	 * @param repetitionNum
	 */
	public Cleaner(String destinationUser, String destinationPassword, String destinationUrl, String sourceUrl, String experimentID, int repetitionNum){
		this.sourceUrl = sourceUrl;
		this.experimentID = experimentID;
		this.repetitionNum = repetitionNum;
		
		this.trialID = getBinaryID(experimentID + repetitionNum);
		connectToCleanRawData(destinationUser, destinationPassword, destinationUrl);
		
		insertExperimentRecord();
	}
	
	/**
	 * insertExperimentRecord method inserts the record about the experiment in the table Experiment.
	 */
	private void insertExperimentRecord(){
		Connection destConn = destDB.connectDB();
		DSLContext database = DSL.using(destConn, SQLDialect.MYSQL);
		
		Result<ExperimentRecord> insertExperiment = null;
		try{
			insertExperiment =  database.newResult(Experiment.EXPERIMENT);			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		ExperimentRecord recordToAdd = null;
		recordToAdd = database.newRecord(Experiment.EXPERIMENT);
		
		recordToAdd.setExperimentid( experimentID );
		recordToAdd.setReplicationnum( new Integer(repetitionNum) );
		recordToAdd.setTrialid( trialID );
		
		insertExperiment.add(recordToAdd);
		
		try{
			storeCleanData(Experiment.EXPERIMENT, insertExperiment);
		}catch(org.jooq.exception.DataAccessException e1){
			System.err.println("Experiment already inserted.");
			return;
		}catch(Exception e){
			System.err.println("Experiment already inserted.");
			e.printStackTrace();
			return;
		}
		
		try {
			destConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * connectToCleanRawData methods connects to the clean database
	 * 
	 * @param destinationUser
	 * @param destinationPassword
	 * @param destinationUrl must be formated correctly according URL requirements
	 */
	void connectToCleanRawData(String destinationUser, String destinationPassword, String destinationUrl){
		try {
			destDB = new DB( destinationUser, destinationPassword, destinationUrl);
			} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
//	void storeCleanData(Table<?> insertIntoTable, Result<?> records){
//		Connection destConn = destDB.connectDB();
//		DSLContext database = DSL.using(destConn, SQLDialect.MYSQL);
//		
//		int i = 0;
//		while(i < records.size()){
//			InsertSetStep<?> insert = database.insertInto(insertIntoTable); //NB: insert si fa per un record alla volta
//			Record record= records.get(i);
//			insert.set(record).execute(); //TODO togliere commento
//			i++;
//		}
//		
//		try {
//			destConn.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * storeCleanData methods stores clean data into the table of the clean database.
	 * 
	 * @param records is the set of clean records to store
	 * @param insertIntoTable is the table where to insert records
	 */
	void storeCleanData(Table<?> insertIntoTable, Result<?> records){
		final int INCREMENT_STEP = 5000;
		int fromIndex, toIndex, tempIndex, maxIndex, lastIncrement;
		maxIndex = records.size();
		lastIncrement = maxIndex % INCREMENT_STEP;
		
		List<Thread> threads = new ArrayList();
		
		List<List<?>> dataInputPerThread = new ArrayList();
		fromIndex = 0;
		toIndex = 0;
		int i = 1;
		while(fromIndex + INCREMENT_STEP < maxIndex){
//			System.out.println(i + " started to store data"); i++;
			toIndex = toIndex + INCREMENT_STEP;
			List<?> resultListTemp = records.subList(fromIndex, toIndex);
						
			dataInputPerThread.add(resultListTemp);
			
			StoreCleanData threadObject = new StoreCleanData(destDB.connectDB(), insertIntoTable, resultListTemp);
			Thread thread = new Thread(threadObject);
			thread.start();
			
			threads.add(thread);
			fromIndex += INCREMENT_STEP;
		}
		{
			toIndex = maxIndex;
			List<?> resultListTemp = records.subList(fromIndex, toIndex);

			dataInputPerThread.add(resultListTemp);

			StoreCleanData threadObject = new StoreCleanData(destDB.connectDB(), insertIntoTable, resultListTemp);
			Thread thread = new Thread(threadObject);
			thread.start();

			threads.add(thread);
		}
		
		Iterator<Thread> threadIterator = threads.iterator();
		while(threadIterator.hasNext()){
			Thread temp = threadIterator.next();
			try {
				temp.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
//	String createIDByStrings(String[] strings){
//		String input = null;
//		for(String str: strings){
//			input = input + str;
//		}
//		return createID(input);
//	}
	
	/**
	 * getBinaryID hashes a string to be used for ID.
	 * 
	 * @param stringID is a string value
	 * @return a byte array representing the MD5 hashing function of the stringID.
	 */
	byte[] getBinaryID(String stringID){
		byte[] byteString = null;
		byte[] thedigest = null;
		try {
			byteString = stringID.getBytes("UTF-8");
			
			MessageDigest mdig = MessageDigest.getInstance("MD5");
			thedigest = mdig.digest(byteString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return thedigest;
	}

//	String createID(String string){
//		String result = string;
//		if (string != null) {
//			MessageDigest md;
//			try {
//				
//				byte[] bytesOfMessage = string.getBytes("UTF-8");
//
//				MessageDigest mdig = MessageDigest.getInstance("MD5");
//				byte[] thedigest = mdig.digest(bytesOfMessage);
//				return thedigest.toString();
//				
////				md = MessageDigest.getInstance("MD5");
////				md.update(string.getBytes());
////				BigInteger hash = new BigInteger(1, md.digest());
////				result = hash.toString(16);
////				while (result.length() < 32) { // 40 for SHA-1
////					result = "0" + result;
////				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
//		}
//		return result;
//	}
	
	/**
	 * initializeResult method initializes a set of record result.
	 * 
	 * @param DSLContext is the context of the database to use
	 * @param table is the table where result will be inserted
	 * @return result initialized according the table and the database used
	 */
	public Result initializeResult(DSLContext databaseContext, TableImpl table){
		Result<?> ret = null;

		try{
			ret =  databaseContext.newResult(table);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ret;
	}
	
	/**
	 * initializeDBContext method initializes context to interact with database.
	 * 
	 * @param database is the database to use
	 * @param dialect is the SQL dialect to apply to query the database; e.g: SQLDialect.MYSQL
	 * @return context initialized according the database used and the query language selected
	 */
	public DSLContext initializeDBContext(DB database, SQLDialect dialect){
		Connection conn = database.connectDB();
		DSLContext databaseCtx = DSL.using(conn, dialect);

		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return databaseCtx;
	}

	public DB getDestDB() {
		return destDB;
	}
	
}
