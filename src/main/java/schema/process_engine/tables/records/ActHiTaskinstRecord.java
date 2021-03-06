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
public class ActHiTaskinstRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActHiTaskinstRecord> implements org.jooq.Record18<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 1613599327;

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.PROC_DEF_ID_</code>.
	 */
	public void setProcDefId_(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.PROC_DEF_ID_</code>.
	 */
	public java.lang.String getProcDefId_() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.TASK_DEF_KEY_</code>.
	 */
	public void setTaskDefKey_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.TASK_DEF_KEY_</code>.
	 */
	public java.lang.String getTaskDefKey_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.PROC_INST_ID_</code>.
	 */
	public void setProcInstId_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.PROC_INST_ID_</code>.
	 */
	public java.lang.String getProcInstId_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.EXECUTION_ID_</code>.
	 */
	public void setExecutionId_(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.EXECUTION_ID_</code>.
	 */
	public java.lang.String getExecutionId_() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.ACT_INST_ID_</code>.
	 */
	public void setActInstId_(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.ACT_INST_ID_</code>.
	 */
	public java.lang.String getActInstId_() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.NAME_</code>.
	 */
	public void setName_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.NAME_</code>.
	 */
	public java.lang.String getName_() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.PARENT_TASK_ID_</code>.
	 */
	public void setParentTaskId_(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.PARENT_TASK_ID_</code>.
	 */
	public java.lang.String getParentTaskId_() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.DESCRIPTION_</code>.
	 */
	public void setDescription_(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.DESCRIPTION_</code>.
	 */
	public java.lang.String getDescription_() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.OWNER_</code>.
	 */
	public void setOwner_(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.OWNER_</code>.
	 */
	public java.lang.String getOwner_() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.ASSIGNEE_</code>.
	 */
	public void setAssignee_(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.ASSIGNEE_</code>.
	 */
	public java.lang.String getAssignee_() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.START_TIME_</code>.
	 */
	public void setStartTime_(java.sql.Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.START_TIME_</code>.
	 */
	public java.sql.Timestamp getStartTime_() {
		return (java.sql.Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.END_TIME_</code>.
	 */
	public void setEndTime_(java.sql.Timestamp value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.END_TIME_</code>.
	 */
	public java.sql.Timestamp getEndTime_() {
		return (java.sql.Timestamp) getValue(12);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.DURATION_</code>.
	 */
	public void setDuration_(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.DURATION_</code>.
	 */
	public java.lang.Long getDuration_() {
		return (java.lang.Long) getValue(13);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.DELETE_REASON_</code>.
	 */
	public void setDeleteReason_(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.DELETE_REASON_</code>.
	 */
	public java.lang.String getDeleteReason_() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.PRIORITY_</code>.
	 */
	public void setPriority_(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.PRIORITY_</code>.
	 */
	public java.lang.Integer getPriority_() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.DUE_DATE_</code>.
	 */
	public void setDueDate_(java.sql.Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.DUE_DATE_</code>.
	 */
	public java.sql.Timestamp getDueDate_() {
		return (java.sql.Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_TASKINST.FOLLOW_UP_DATE_</code>.
	 */
	public void setFollowUpDate_(java.sql.Timestamp value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_TASKINST.FOLLOW_UP_DATE_</code>.
	 */
	public java.sql.Timestamp getFollowUpDate_() {
		return (java.sql.Timestamp) getValue(17);
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
	// Record18 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row18) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row18<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row18) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.PROC_DEF_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.TASK_DEF_KEY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.PROC_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.EXECUTION_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.ACT_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.NAME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.PARENT_TASK_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.DESCRIPTION_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.OWNER_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.ASSIGNEE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.START_TIME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field13() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.END_TIME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field14() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.DURATION_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.DELETE_REASON_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.PRIORITY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field17() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.DUE_DATE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field18() {
		return schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST.FOLLOW_UP_DATE_;
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
	public java.lang.String value2() {
		return getProcDefId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTaskDefKey_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getProcInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getExecutionId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getActInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getName_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getParentTaskId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getDescription_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getOwner_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getAssignee_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value12() {
		return getStartTime_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value13() {
		return getEndTime_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value14() {
		return getDuration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getDeleteReason_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getPriority_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value17() {
		return getDueDate_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value18() {
		return getFollowUpDate_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value2(java.lang.String value) {
		setProcDefId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value3(java.lang.String value) {
		setTaskDefKey_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value4(java.lang.String value) {
		setProcInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value5(java.lang.String value) {
		setExecutionId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value6(java.lang.String value) {
		setActInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value7(java.lang.String value) {
		setName_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value8(java.lang.String value) {
		setParentTaskId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value9(java.lang.String value) {
		setDescription_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value10(java.lang.String value) {
		setOwner_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value11(java.lang.String value) {
		setAssignee_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value12(java.sql.Timestamp value) {
		setStartTime_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value13(java.sql.Timestamp value) {
		setEndTime_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value14(java.lang.Long value) {
		setDuration_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value15(java.lang.String value) {
		setDeleteReason_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value16(java.lang.Integer value) {
		setPriority_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value17(java.sql.Timestamp value) {
		setDueDate_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord value18(java.sql.Timestamp value) {
		setFollowUpDate_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiTaskinstRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.sql.Timestamp value12, java.sql.Timestamp value13, java.lang.Long value14, java.lang.String value15, java.lang.Integer value16, java.sql.Timestamp value17, java.sql.Timestamp value18) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActHiTaskinstRecord
	 */
	public ActHiTaskinstRecord() {
		super(schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST);
	}

	/**
	 * Create a detached, initialised ActHiTaskinstRecord
	 */
	public ActHiTaskinstRecord(java.lang.String id_, java.lang.String procDefId_, java.lang.String taskDefKey_, java.lang.String procInstId_, java.lang.String executionId_, java.lang.String actInstId_, java.lang.String name_, java.lang.String parentTaskId_, java.lang.String description_, java.lang.String owner_, java.lang.String assignee_, java.sql.Timestamp startTime_, java.sql.Timestamp endTime_, java.lang.Long duration_, java.lang.String deleteReason_, java.lang.Integer priority_, java.sql.Timestamp dueDate_, java.sql.Timestamp followUpDate_) {
		super(schema.process_engine.tables.ActHiTaskinst.ACT_HI_TASKINST);

		setValue(0, id_);
		setValue(1, procDefId_);
		setValue(2, taskDefKey_);
		setValue(3, procInstId_);
		setValue(4, executionId_);
		setValue(5, actInstId_);
		setValue(6, name_);
		setValue(7, parentTaskId_);
		setValue(8, description_);
		setValue(9, owner_);
		setValue(10, assignee_);
		setValue(11, startTime_);
		setValue(12, endTime_);
		setValue(13, duration_);
		setValue(14, deleteReason_);
		setValue(15, priority_);
		setValue(16, dueDate_);
		setValue(17, followUpDate_);
	}
}
