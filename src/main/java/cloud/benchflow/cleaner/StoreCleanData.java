package cloud.benchflow.cleaner;

import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.InsertSetMoreStep;
import org.jooq.InsertSetStep;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;

public class StoreCleanData implements Runnable{
	private Table<?> table;
	private Result<?> records;
	private Connection destConn;
	private List<?> recordsList;
	SQLDialect sqlDialect;
	
	/**
	 * @param connectionDestinationDatabaseURL must be formated correctly according URL requirements 
	 * 		and it is the clean database where to store clean records
	 * @param insertIntoTable
	 * @param recordsToInsert
	 */
	public StoreCleanData(Connection connectionDestinationDatabaseURL, Table<?> insertIntoTable, Result<?> recordsToInsert) {
		destConn = connectionDestinationDatabaseURL;
		table = insertIntoTable;
		records = recordsToInsert;
		recordsList = null;
	}
	
	/**
	 * @param connectionDestinationDatabaseURL must be formated correctly according URL requirements 
	 * 		and it is the clean database where to store clean records
	 * @param insertIntoTable
	 * @param recordsToInsert
	 */
	public StoreCleanData(Connection connectionDestinationDatabaseURL, Table<?> insertIntoTable, List<?> recordsToInsert) {
		destConn = connectionDestinationDatabaseURL;
		table = insertIntoTable;
		recordsList = recordsToInsert;
		records = null;
	}

	/**
	 * insert the records into the clean database. 
	 */
	public void run() {
		SQLDialect d = SQLDialect.MYSQL;
		if(recordsList == null){
			insertDataFromResult();
		}else if(records == null){
			insertDataFromList();
		}else{
			System.err.println("error record to insert in thread");
		}
		try {
			destConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

//	private void insertDataFromList() {
//		DSLContext database = DSL.using(destConn, SQLDialect.MYSQL);
//		int i = 0;
//		Iterator<Record> recordIterator = (Iterator<Record>) recordsList.iterator();
////		database.execute("set foreign_key_checks=0");
//		while(recordIterator.hasNext()){
//			
//			InsertSetStep<?> insert = database.insertInto(table); //NB: insert si fa per un record alla volta
//			Record record= recordIterator.next();
//			try{
//			insert.set(record).execute();
//			}catch(Exception e){
////					e.printStackTrace();
//				String recordValues = "";
//				Field<?>[] fields =  record.fields();
//				for(Field f: fields){
//					recordValues += record.getValue(f) + " ";
//				}
//				System.err.println("Table: "+ table + " ; Field: "+recordValues + " ; Error: " +e.getMessage());
//			}
//			i++;
//		}
////		database.execute("set foreign_key_checks=1");
//	}
	
	private void insertDataFromList() {
		DSLContext database = DSL.using(destConn, SQLDialect.MYSQL);
		int i = 0;
		Iterator<Record> recordIterator = (Iterator<Record>) recordsList.iterator();
//		database.execute("set foreign_key_checks=0");
		InsertSetStep<?> insert = database.insertInto(table); //NB: insert si fa per un record alla volta
		Record lastRecord = recordIterator.next();
		while(recordIterator.hasNext()){
			Record record = recordIterator.next();
			insert = insert.set(record).newRecord();
		}
		insert.set(lastRecord).execute();
		try{
			
			}catch(Exception e){
//					e.printStackTrace();
				System.err.println( e.getMessage() );
//				String recordValues = "";
//				Field<?>[] fields =  record.fields();
//				for(Field f: fields){
//					recordValues += record.getValue(f) + " ";
//				}
//				System.err.println("Table: "+ table + " ; Field: "+recordValues + " ; Error: " +e.getMessage());
			}
			i++;
//		database.execute("set foreign_key_checks=1");
	}

	private void insertDataFromResult() {
		DSLContext database = DSL.using(destConn, SQLDialect.MYSQL);
		int i = 0;
		while(i < records.size()){
			InsertSetStep<?> insert = database.insertInto(table); //NB: insert si fa per un record alla volta
			Record record= records.get(i);
			insert.set(record).execute();
			i++;
		}
	}
		
}
