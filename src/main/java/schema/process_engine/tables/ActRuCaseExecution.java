/**
 * This class is generated by jOOQ
 */
package schema.process_engine.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActRuCaseExecution extends org.jooq.impl.TableImpl<schema.process_engine.tables.records.ActRuCaseExecutionRecord> {

	private static final long serialVersionUID = 964995827;

	/**
	 * The reference instance of <code>process-engine.ACT_RU_CASE_EXECUTION</code>
	 */
	public static final schema.process_engine.tables.ActRuCaseExecution ACT_RU_CASE_EXECUTION = new schema.process_engine.tables.ActRuCaseExecution();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.process_engine.tables.records.ActRuCaseExecutionRecord> getRecordType() {
		return schema.process_engine.tables.records.ActRuCaseExecutionRecord.class;
	}

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> ID_ = createField("ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.REV_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.Integer> REV_ = createField("REV_", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.CASE_INST_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> CASE_INST_ID_ = createField("CASE_INST_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.SUPER_CASE_EXEC_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> SUPER_CASE_EXEC_ = createField("SUPER_CASE_EXEC_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.BUSINESS_KEY_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> BUSINESS_KEY_ = createField("BUSINESS_KEY_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.PARENT_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> PARENT_ID_ = createField("PARENT_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.CASE_DEF_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> CASE_DEF_ID_ = createField("CASE_DEF_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.ACT_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.String> ACT_ID_ = createField("ACT_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.PREV_STATE_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.Integer> PREV_STATE_ = createField("PREV_STATE_", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>process-engine.ACT_RU_CASE_EXECUTION.CURRENT_STATE_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuCaseExecutionRecord, java.lang.Integer> CURRENT_STATE_ = createField("CURRENT_STATE_", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>process-engine.ACT_RU_CASE_EXECUTION</code> table reference
	 */
	public ActRuCaseExecution() {
		this("ACT_RU_CASE_EXECUTION", null);
	}

	/**
	 * Create an aliased <code>process-engine.ACT_RU_CASE_EXECUTION</code> table reference
	 */
	public ActRuCaseExecution(java.lang.String alias) {
		this(alias, schema.process_engine.tables.ActRuCaseExecution.ACT_RU_CASE_EXECUTION);
	}

	private ActRuCaseExecution(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActRuCaseExecutionRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActRuCaseExecution(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActRuCaseExecutionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.process_engine.Process_engine.PROCESS_ENGINE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<schema.process_engine.tables.records.ActRuCaseExecutionRecord> getPrimaryKey() {
		return schema.process_engine.Keys.KEY_ACT_RU_CASE_EXECUTION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<schema.process_engine.tables.records.ActRuCaseExecutionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<schema.process_engine.tables.records.ActRuCaseExecutionRecord>>asList(schema.process_engine.Keys.KEY_ACT_RU_CASE_EXECUTION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<schema.process_engine.tables.records.ActRuCaseExecutionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<schema.process_engine.tables.records.ActRuCaseExecutionRecord, ?>>asList(schema.process_engine.Keys.ACT_FK_CASE_EXE_CASE_INST, schema.process_engine.Keys.ACT_FK_CASE_EXE_PARENT, schema.process_engine.Keys.ACT_FK_CASE_EXE_CASE_DEF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.process_engine.tables.ActRuCaseExecution as(java.lang.String alias) {
		return new schema.process_engine.tables.ActRuCaseExecution(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.process_engine.tables.ActRuCaseExecution rename(java.lang.String name) {
		return new schema.process_engine.tables.ActRuCaseExecution(name, null);
	}
}
