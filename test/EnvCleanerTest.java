import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Record;
import org.jooq.Result;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cleandb.cleanrawdata.tables.records.EnvironmentdataRecord;
import cloud.benchflow.cleaner.EnvCleaner;


public class EnvCleanerTest {
	static EnvCleaner envEngine;
	static EnvCleaner envDBMS;
	static List<String> s;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		String sourceUrlDBMS = "/Users/marco/Desktop/tesi/cleaner/runsData/single/single_5/first_run/Activiti_5_Users_DBMS.log";
		String sourceUrlEngine = "/Users/marco/Desktop/tesi/cleaner/runsData/single/single_5/first_run/Activiti_5_Users_Engine.log";
		String destUrl = "jdbc:mysql://192.168.59.103:13000/CleanRawData";
		String userPass = "root";
		envEngine = new EnvCleaner( userPass , userPass, destUrl, sourceUrlEngine, "expEnv", 0, "envID");
		envDBMS = new EnvCleaner( userPass , userPass, destUrl, sourceUrlDBMS, "expEnv", 0, "envID");
	}

	@Before
	public void setUp() throws Exception {
		s = new ArrayList<String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnvEngine() {
		s.add("1:engine 0.00%;1.41 GiB/62.99 GiB;2.25%;155.4 KiB/100.8 KiB");
		
		Result<EnvironmentdataRecord> res = envEngine.transformEnvironmentdata( s );
		
		EnvironmentdataRecord rec = res.get(0);
	
		BigDecimal cpu = rec.getCpupercent();
		BigDecimal exp = new BigDecimal(0);
		assertTrue(cpu.floatValue() == exp.floatValue() );
		
		BigDecimal expMemUsed = new BigDecimal(1410);
		BigDecimal memUsed = rec.getMemoryused();
		assertTrue(memUsed.floatValue() == expMemUsed.floatValue() );
		
		
		BigDecimal expMemTot = new BigDecimal(62990);
		BigDecimal memTot = rec.getMemorytot();
		assertTrue(memTot.floatValue() == expMemTot.floatValue() );
		
		BigDecimal expMemPer = new BigDecimal(2.25);
		BigDecimal memPer = rec.getMemorypercent();
		assertTrue(memPer.floatValue() == expMemPer.floatValue() );
		
		BigDecimal expNetIn = new BigDecimal(0.1554);
		BigDecimal netIn = rec.getNetworkin();
		assertTrue(netIn.floatValue() == expNetIn.floatValue() );
		
		BigDecimal expNetOut = new BigDecimal(0.1008);
		BigDecimal netOut = rec.getNetworkout();
		assertTrue(netOut.floatValue() == expNetOut.floatValue() );
	}
	
	@Test
	public void testEnvDBMS() {
		s.add("1:mysql               0.00%               106.2 MiB/125.7 GiB   0.08%               551.3 KiB/454.5 KiB");
		
		Result<EnvironmentdataRecord> res = envEngine.transformEnvironmentdata( s );
		
		EnvironmentdataRecord rec = res.get(0);
	
		BigDecimal cpu = rec.getCpupercent();
		BigDecimal expCPU = new BigDecimal(0.0);
		assertTrue(cpu.floatValue() == expCPU.floatValue() );
		
		BigDecimal expMemUsed = new BigDecimal(106.2);
		BigDecimal memUsed = rec.getMemoryused();
		assertTrue(memUsed.floatValue() == expMemUsed.floatValue() );
		
		BigDecimal expMemTot = new BigDecimal(125700);
		BigDecimal memTot = rec.getMemorytot();
		assertTrue(memTot.floatValue() == expMemTot.floatValue() );
		
		BigDecimal expMemPer = new BigDecimal(0.08);
		BigDecimal memPer = rec.getMemorypercent();
		assertTrue(memPer.floatValue() == expMemPer.floatValue() );
		
		BigDecimal expNetIn = new BigDecimal(0.5513);
		BigDecimal netIn = rec.getNetworkin();
		assertTrue(netIn.floatValue() == expNetIn.floatValue() );
		
		BigDecimal expNetOut = new BigDecimal(0.4545);
		BigDecimal netOut = rec.getNetworkout();
		assertTrue(netOut.floatValue() == expNetOut.floatValue() );
	}

}
