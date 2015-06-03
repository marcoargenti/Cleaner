package cloud.benchflow.cleaner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.InsertSetStep;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.TableLike;
import org.jooq.impl.DSL;

import cleandb.cleanrawdata.tables.Environmentdata;
import cleandb.cleanrawdata.tables.records.EnvironmentdataRecord;


public class EnvCleaner extends Cleaner {
	String envID; //environmentID to be converted in binary (unhex) before to load it in DB


	public EnvCleaner(String destinationUser, String destinationPassword,
			String destinationUrl, String sourceUrl, String experimentID,
			int repetitionNum, String environmentID){
		super(destinationUser, destinationPassword, destinationUrl, sourceUrl,
				experimentID, repetitionNum);

		this.envID = environmentID;
	}


	/**
	 * 
	 * @param lines has the number of line then ':' and the environment
	 * @return records
	 */
	public Result<EnvironmentdataRecord> transformEnvironmentdata(List<String> lines){
		Connection destConn = getDestDB().connectDB();
		DSLContext database = DSL.using(destConn, SQLDialect.MYSQL);

		Result<EnvironmentdataRecord> ret = null;
		try{
			ret =  database.newResult(Environmentdata.ENVIRONMENTDATA);			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		byte[] envIDByte = getBinaryID(envID);
		byte[] trialIDByte = trialID;

		for(String lineWithNum: lines){
			EnvironmentdataRecord recordToAdd = null;
			recordToAdd = database.newRecord(Environmentdata.ENVIRONMENTDATA);

			String delimit = ":";
			String[] temp = lineWithNum.split(delimit);
			String lineNumber = temp[0];
			String line = temp[1];

			String spacesDelims = "[ ]+|;";
			String[] tokens = line.split(spacesDelims);

			String percent = "%";
			String[] cpuPercents = tokens[1].split(percent);
			String[] memPercents = tokens[5].split(percent);

			String slash = "/";
			String[] tempMem = tokens[3].split(slash);
			String[] memUsed = new String[2];
			String[] memLim = new String[2];

			memUsed[0]= tokens[2];
			memUsed[1]= tempMem[0];

			memLim[0]= tempMem[1];
			memLim[1]= tokens[4];

			String[] netIn = new String[2];
			String[] netOut = new String[2];
			String[] tempNet = tokens[7].split(slash);
			netIn[0] = tokens[6];
			netIn[1] = tempNet[0];
			netOut[0] = tempNet[1];
			netOut[1] = tokens[8];

			Float cpuPercent;
			Float memoryPercent;
			Float memoryLimit;
			Float memoryUsed;
			Float networkIn;
			Float networkOut;

			cpuPercent = convertStringToDecimal(cpuPercents[0], 10);
			memoryPercent = convertStringToDecimal(memPercents[0], 10);
			memoryLimit = Float.parseFloat(memLim[0]);
			memoryUsed = Float.parseFloat(memUsed[0]);
			networkIn = Float.parseFloat(netIn[0]);
			networkOut = Float.parseFloat(netOut[0]);

			//convert unit of measures
			memoryLimit =  convertByteUnit(memoryLimit , memLim[1] , "MiB");
			memoryUsed = convertByteUnit(memoryUsed , memUsed[1] , "MiB");
			networkIn = convertByteUnit(networkIn , netIn[1] , "MiB");
			networkOut = convertByteUnit(networkOut , netOut[1] , "MiB");

			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.CPUPERCENT, new BigDecimal(cpuPercent.toString()) );
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.MEMORYPERCENT, new BigDecimal(memoryPercent.toString()) );
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.MEMORYTOT, new BigDecimal(memoryLimit.toString()) );
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.MEMORYUSED, new BigDecimal(memoryUsed.toString()) );
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.NETWORKIN, new BigDecimal(networkIn.toString()) );
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.NETWORKOUT, new BigDecimal(networkOut.toString()) );

			Integer lineNumberInt = Integer.parseInt(lineNumber);
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.ENVIRONMENTID,  envIDByte );
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.LINENUMBER,  lineNumberInt);
			recordToAdd.setValue(Environmentdata.ENVIRONMENTDATA.TRIALID, trialIDByte );

			ret.add( recordToAdd );
		}

		try {
			destConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 
	 * @return a list of the String extracted from the sourceURL,
	 *  the Strings have to be transformed and the first number is the line number.
	 */
	List<String> selectData(){
		List<String> ret = new ArrayList();

		try{
			BufferedReader br = new BufferedReader(new FileReader(sourceUrl));
			String line;
			int lineNumber = 0;
			while ((line = br.readLine()) != null) {
				lineNumber++;
				String delims = "[ ]+";
				String[] tokens = line.split(delims);
				boolean lineToConsider = true;

				lineToConsider = !line.matches(".+CPU.+");

				if(lineToConsider){
					boolean engine = line.matches(".+;.+");
					if(engine){
						ret.add(lineNumber+":engine  "+line);
					}else{
						ret.add(lineNumber+":"+line);
					}
				}

			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return ret;
	}

	/**
	 * @return convert a string to decimal
	 */
	public float convertStringToDecimal(String number, int numMaxDecimals){
		Float numFloat = Float.parseFloat(number);

		DecimalFormat decimalFormat = new DecimalFormat("##.#");
		decimalFormat.setMaximumFractionDigits(numMaxDecimals);
		numFloat = Float.parseFloat(decimalFormat.format(numFloat));
		return numFloat.floatValue();
	}

	private int identifyUnit(String unit){
		if( unit.matches(".*GiB.*") ){
			return 1000000000;
		}else{
			if( unit.matches(".*MiB.*") ){
				return 1000000;
			}else{
				if( unit.matches(".*KiB.*") ){
					return 1000;
				}
			}
		}
		return 1;
	}
	
	/**
	 * @return modify units of measurements
	 */
	float convertByteUnit(float value, String fromUnit, String toUnit){
		float convertedValue = 0;
		int multiplyBy = identifyUnit(fromUnit);
		int divideBy = identifyUnit(toUnit);
		
		convertedValue = value * (float)multiplyBy / (float)divideBy;
		
		return convertedValue;
	}

	public static void main(String[] args) {
		String sourceUrlDBMS = "/Users/marco/Desktop/tesi/cleaner/runsData/single/single_5/first_run/Activiti_5_Users_DBMS.log";
		String sourceUrlEngine = "/Users/marco/Desktop/tesi/cleaner/runsData/single/single_5/first_run/Activiti_5_Users_Engine.log";
		String destUrl = "jdbc:mysql://192.168.59.103:13000/CleanRawData";
		String userPass = "root";
		EnvCleaner env = new EnvCleaner( userPass , userPass, destUrl, sourceUrlEngine, "expEnv", 0, "envID");
		
		List<String> sourceData = env.selectData();
		Result<EnvironmentdataRecord> record = env.transformEnvironmentdata(sourceData);
		env.storeCleanData(Environmentdata.ENVIRONMENTDATA, record);
		
	}

}
