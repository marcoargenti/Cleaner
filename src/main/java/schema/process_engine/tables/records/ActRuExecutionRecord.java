/**
 * This class is generated by jOOQ
 */
package schema.process_engine.tables.records;

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
public class ActRuExecutionRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActRuExecutionRecord> implements org.jooq.Record17<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Byte, java.lang.Byte, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 465758022;

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.REV_</code>.
	 */
	public void setRev_(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.REV_</code>.
	 */
	public java.lang.Integer getRev_() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.PROC_INST_ID_</code>.
	 */
	public void setProcInstId_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.PROC_INST_ID_</code>.
	 */
	public java.lang.String getProcInstId_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.BUSINESS_KEY_</code>.
	 */
	public void setBusinessKey_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.BUSINESS_KEY_</code>.
	 */
	public java.lang.String getBusinessKey_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.PARENT_ID_</code>.
	 */
	public void setParentId_(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.PARENT_ID_</code>.
	 */
	public java.lang.String getParentId_() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.PROC_DEF_ID_</code>.
	 */
	public void setProcDefId_(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.PROC_DEF_ID_</code>.
	 */
	public java.lang.String getProcDefId_() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.SUPER_EXEC_</code>.
	 */
	public void setSuperExec_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.SUPER_EXEC_</code>.
	 */
	public java.lang.String getSuperExec_() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.SUPER_CASE_EXEC_</code>.
	 */
	public void setSuperCaseExec_(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.SUPER_CASE_EXEC_</code>.
	 */
	public java.lang.String getSuperCaseExec_() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.CASE_INST_ID_</code>.
	 */
	public void setCaseInstId_(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.CASE_INST_ID_</code>.
	 */
	public java.lang.String getCaseInstId_() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.ACT_ID_</code>.
	 */
	public void setActId_(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.ACT_ID_</code>.
	 */
	public java.lang.String getActId_() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.ACT_INST_ID_</code>.
	 */
	public void setActInstId_(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.ACT_INST_ID_</code>.
	 */
	public java.lang.String getActInstId_() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.IS_ACTIVE_</code>.
	 */
	public void setIsActive_(java.lang.Byte value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.IS_ACTIVE_</code>.
	 */
	public java.lang.Byte getIsActive_() {
		return (java.lang.Byte) getValue(11);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.IS_CONCURRENT_</code>.
	 */
	public void setIsConcurrent_(java.lang.Byte value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.IS_CONCURRENT_</code>.
	 */
	public java.lang.Byte getIsConcurrent_() {
		return (java.lang.Byte) getValue(12);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.IS_SCOPE_</code>.
	 */
	public void setIsScope_(java.lang.Byte value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.IS_SCOPE_</code>.
	 */
	public java.lang.Byte getIsScope_() {
		return (java.lang.Byte) getValue(13);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.IS_EVENT_SCOPE_</code>.
	 */
	public void setIsEventScope_(java.lang.Byte value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.IS_EVENT_SCOPE_</code>.
	 */
	public java.lang.Byte getIsEventScope_() {
		return (java.lang.Byte) getValue(14);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.SUSPENSION_STATE_</code>.
	 */
	public void setSuspensionState_(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.SUSPENSION_STATE_</code>.
	 */
	public java.lang.Integer getSuspensionState_() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EXECUTION.CACHED_ENT_STATE_</code>.
	 */
	public void setCachedEntState_(java.lang.Integer value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EXECUTION.CACHED_ENT_STATE_</code>.
	 */
	public java.lang.Integer getCachedEntState_() {
		return (java.lang.Integer) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Byte, java.lang.Byte, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Byte, java.lang.Byte, java.lang.Byte, java.lang.Byte, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.REV_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.PROC_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.BUSINESS_KEY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.PARENT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.PROC_DEF_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.SUPER_EXEC_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.SUPER_CASE_EXEC_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.CASE_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.ACT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.ACT_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field12() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.IS_ACTIVE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field13() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.IS_CONCURRENT_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field14() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.IS_SCOPE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field15() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.IS_EVENT_SCOPE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.SUSPENSION_STATE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field17() {
		return schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION.CACHED_ENT_STATE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getRev_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getProcInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getBusinessKey_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getParentId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getProcDefId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getSuperExec_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getSuperCaseExec_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getCaseInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getActId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getActInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value12() {
		return getIsActive_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value13() {
		return getIsConcurrent_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value14() {
		return getIsScope_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value15() {
		return getIsEventScope_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getSuspensionState_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value17() {
		return getCachedEntState_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value2(java.lang.Integer value) {
		setRev_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value3(java.lang.String value) {
		setProcInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value4(java.lang.String value) {
		setBusinessKey_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value5(java.lang.String value) {
		setParentId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value6(java.lang.String value) {
		setProcDefId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value7(java.lang.String value) {
		setSuperExec_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value8(java.lang.String value) {
		setSuperCaseExec_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value9(java.lang.String value) {
		setCaseInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value10(java.lang.String value) {
		setActId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value11(java.lang.String value) {
		setActInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value12(java.lang.Byte value) {
		setIsActive_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value13(java.lang.Byte value) {
		setIsConcurrent_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value14(java.lang.Byte value) {
		setIsScope_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value15(java.lang.Byte value) {
		setIsEventScope_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value16(java.lang.Integer value) {
		setSuspensionState_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord value17(java.lang.Integer value) {
		setCachedEntState_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuExecutionRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.Byte value12, java.lang.Byte value13, java.lang.Byte value14, java.lang.Byte value15, java.lang.Integer value16, java.lang.Integer value17) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActRuExecutionRecord
	 */
	public ActRuExecutionRecord() {
		super(schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION);
	}

	/**
	 * Create a detached, initialised ActRuExecutionRecord
	 */
	public ActRuExecutionRecord(java.lang.String id_, java.lang.Integer rev_, java.lang.String procInstId_, java.lang.String businessKey_, java.lang.String parentId_, java.lang.String procDefId_, java.lang.String superExec_, java.lang.String superCaseExec_, java.lang.String caseInstId_, java.lang.String actId_, java.lang.String actInstId_, java.lang.Byte isActive_, java.lang.Byte isConcurrent_, java.lang.Byte isScope_, java.lang.Byte isEventScope_, java.lang.Integer suspensionState_, java.lang.Integer cachedEntState_) {
		super(schema.process_engine.tables.ActRuExecution.ACT_RU_EXECUTION);

		setValue(0, id_);
		setValue(1, rev_);
		setValue(2, procInstId_);
		setValue(3, businessKey_);
		setValue(4, parentId_);
		setValue(5, procDefId_);
		setValue(6, superExec_);
		setValue(7, superCaseExec_);
		setValue(8, caseInstId_);
		setValue(9, actId_);
		setValue(10, actInstId_);
		setValue(11, isActive_);
		setValue(12, isConcurrent_);
		setValue(13, isScope_);
		setValue(14, isEventScope_);
		setValue(15, suspensionState_);
		setValue(16, cachedEntState_);
	}
}
