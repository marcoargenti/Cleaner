import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Iterator;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import schema.process_engine.tables.ActHiActinst;
import schema.process_engine.tables.ActHiProcinst;
import schema.process_engine.tables.records.ActHiActinstRecord;
import schema.process_engine.tables.records.ActHiProcinstRecord;
import cleandb.cleanrawdata.tables.Construct;
import cleandb.cleanrawdata.tables.records.ConstructRecord;
import cleandb.cleanrawdata.tables.records.ProcessRecord;
import cloud.benchflow.cleaner.CamundaCleaner;


public class CamundaCleanerTest {
	static CamundaCleaner cc;
	Result<ActHiActinstRecord>  inputConstruct;
	Result<ActHiProcinstRecord>  inputProcess;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		String sourceUser = "root";
		String sourcePassword = "root";
		String sourceUrl = "jdbc:mysql://192.168.59.103:13011/process-engine";
		String destUser = "root";
		String destPassword = "root";
		String destUrl = "jdbc:mysql://192.168.59.103:13000/CleanRawData";
		String experimentID = "expProccessProva";
		
		cc = new CamundaCleaner(destUser, destPassword, destUrl, sourceUrl, sourceUser, sourcePassword, experimentID, 0);
		
	}
	
	@Before
	public  void setUp() throws Exception {
		DSLContext dbContext = cc.initializeDBContext(cc.getDestDB(), SQLDialect.MYSQL);
		inputConstruct = cc.initializeResult(dbContext, ActHiActinst.ACT_HI_ACTINST );
		inputProcess = cc.initializeResult(dbContext, ActHiProcinst.ACT_HI_PROCINST);
		
		ActHiActinstRecord record = null;
		record = (ActHiActinstRecord) dbContext.newRecord(ActHiActinst.ACT_HI_ACTINST);

		record.setValue(ActHiActinst.ACT_HI_ACTINST.ACT_ID_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.ACT_NAME_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.ACT_TYPE_, "timerEvent");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.ASSIGNEE_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.CALL_PROC_INST_ID_, "id");
		
		record.setValue(ActHiActinst.ACT_HI_ACTINST.DURATION_, new Long(100) );
		record.setValue(ActHiActinst.ACT_HI_ACTINST.END_TIME_, new Timestamp(100) );
		record.setValue(ActHiActinst.ACT_HI_ACTINST.EXECUTION_ID_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.ID_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.PARENT_ACT_INST_ID_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.PROC_DEF_ID_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.PROC_INST_ID_, "id");
		record.setValue(ActHiActinst.ACT_HI_ACTINST.START_TIME_, new Timestamp(100));
		record.setValue(ActHiActinst.ACT_HI_ACTINST.TASK_ID_, "id");

		inputConstruct.add( record );
		
		ActHiProcinstRecord recordProcess = null;
		recordProcess = (ActHiProcinstRecord) dbContext.newRecord(ActHiProcinst.ACT_HI_PROCINST);
		
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.BUSINESS_KEY_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.DELETE_REASON_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.DURATION_, new Long(100));
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.END_ACT_ID_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.END_TIME_,  new Timestamp(100));
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.ID_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.PROC_DEF_ID_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.PROC_INST_ID_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.START_ACT_ID_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.START_TIME_,  new Timestamp(100));
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.PROC_DEF_ID_, "id");
		recordProcess.setValue(ActHiProcinst.ACT_HI_PROCINST.SUPER_PROCESS_INSTANCE_ID_, "id");
		
		inputProcess.add(recordProcess);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testTransformProcess() {
		Result<ProcessRecord> destProcessRecord = cc.transformProcess( inputProcess );
		ProcessRecord procRecord = destProcessRecord.get(0);
		
		Long duration = procRecord.getDuration();
		Timestamp endtime = procRecord.getEndtime();
		Timestamp starttime = procRecord.getStarttime();
		String model = procRecord.getProcessmodelid();
		String procSource = procRecord.getSourceprocessinstanceid();
		
		assertTrue( duration.equals( new Long(100) ) );
		assertTrue( endtime.equals(new Timestamp(100) ) );
		assertTrue( starttime.equals(new Timestamp(100) ) );
		
		assertTrue( model.equals("id") );
		assertTrue( procSource.equals("id") );
		
	}


	@Test
	public void testTransformConstruct() {
		
		Result<ConstructRecord> destProcessRecord = cc.transformConstruct( inputConstruct );
		ConstructRecord procRecord = destProcessRecord.get(0);
		
		Long duration = procRecord.getDuration();
		Timestamp endtime = procRecord.getEndtime();
		Timestamp starttime = procRecord.getStarttime();
		String constType = procRecord.getConstructtype();
		String constSource = procRecord.getSourceconstructid();
		
		assertTrue( duration.equals( new Long(100) ) );
		assertTrue( endtime.equals(new Timestamp(100) ) );
		assertTrue( starttime.equals(new Timestamp(100) ) );
		
		assertTrue( constType.equals("event") );
		assertTrue( constSource.equals("id") );
		
		
	}


}
