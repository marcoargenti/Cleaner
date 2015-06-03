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
public class ActRuIncidentRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActRuIncidentRecord> implements org.jooq.Record12<java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -102952183;

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.REV_</code>.
	 */
	public void setRev_(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.REV_</code>.
	 */
	public java.lang.Integer getRev_() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.INCIDENT_TIMESTAMP_</code>.
	 */
	public void setIncidentTimestamp_(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.INCIDENT_TIMESTAMP_</code>.
	 */
	public java.sql.Timestamp getIncidentTimestamp_() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.INCIDENT_MSG_</code>.
	 */
	public void setIncidentMsg_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.INCIDENT_MSG_</code>.
	 */
	public java.lang.String getIncidentMsg_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.INCIDENT_TYPE_</code>.
	 */
	public void setIncidentType_(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.INCIDENT_TYPE_</code>.
	 */
	public java.lang.String getIncidentType_() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.EXECUTION_ID_</code>.
	 */
	public void setExecutionId_(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.EXECUTION_ID_</code>.
	 */
	public java.lang.String getExecutionId_() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.ACTIVITY_ID_</code>.
	 */
	public void setActivityId_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.ACTIVITY_ID_</code>.
	 */
	public java.lang.String getActivityId_() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.PROC_INST_ID_</code>.
	 */
	public void setProcInstId_(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.PROC_INST_ID_</code>.
	 */
	public java.lang.String getProcInstId_() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.PROC_DEF_ID_</code>.
	 */
	public void setProcDefId_(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.PROC_DEF_ID_</code>.
	 */
	public java.lang.String getProcDefId_() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.CAUSE_INCIDENT_ID_</code>.
	 */
	public void setCauseIncidentId_(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.CAUSE_INCIDENT_ID_</code>.
	 */
	public java.lang.String getCauseIncidentId_() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.ROOT_CAUSE_INCIDENT_ID_</code>.
	 */
	public void setRootCauseIncidentId_(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.ROOT_CAUSE_INCIDENT_ID_</code>.
	 */
	public java.lang.String getRootCauseIncidentId_() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_INCIDENT.CONFIGURATION_</code>.
	 */
	public void setConfiguration_(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_INCIDENT.CONFIGURATION_</code>.
	 */
	public java.lang.String getConfiguration_() {
		return (java.lang.String) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.REV_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.INCIDENT_TIMESTAMP_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.INCIDENT_MSG_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.INCIDENT_TYPE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.EXECUTION_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.ACTIVITY_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.PROC_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.PROC_DEF_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.CAUSE_INCIDENT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.ROOT_CAUSE_INCIDENT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT.CONFIGURATION_;
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
	public java.sql.Timestamp value3() {
		return getIncidentTimestamp_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getIncidentMsg_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getIncidentType_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getExecutionId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getActivityId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getProcInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getProcDefId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getCauseIncidentId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getRootCauseIncidentId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getConfiguration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value2(java.lang.Integer value) {
		setRev_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value3(java.sql.Timestamp value) {
		setIncidentTimestamp_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value4(java.lang.String value) {
		setIncidentMsg_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value5(java.lang.String value) {
		setIncidentType_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value6(java.lang.String value) {
		setExecutionId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value7(java.lang.String value) {
		setActivityId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value8(java.lang.String value) {
		setProcInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value9(java.lang.String value) {
		setProcDefId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value10(java.lang.String value) {
		setCauseIncidentId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value11(java.lang.String value) {
		setRootCauseIncidentId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord value12(java.lang.String value) {
		setConfiguration_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuIncidentRecord values(java.lang.String value1, java.lang.Integer value2, java.sql.Timestamp value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActRuIncidentRecord
	 */
	public ActRuIncidentRecord() {
		super(schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT);
	}

	/**
	 * Create a detached, initialised ActRuIncidentRecord
	 */
	public ActRuIncidentRecord(java.lang.String id_, java.lang.Integer rev_, java.sql.Timestamp incidentTimestamp_, java.lang.String incidentMsg_, java.lang.String incidentType_, java.lang.String executionId_, java.lang.String activityId_, java.lang.String procInstId_, java.lang.String procDefId_, java.lang.String causeIncidentId_, java.lang.String rootCauseIncidentId_, java.lang.String configuration_) {
		super(schema.process_engine.tables.ActRuIncident.ACT_RU_INCIDENT);

		setValue(0, id_);
		setValue(1, rev_);
		setValue(2, incidentTimestamp_);
		setValue(3, incidentMsg_);
		setValue(4, incidentType_);
		setValue(5, executionId_);
		setValue(6, activityId_);
		setValue(7, procInstId_);
		setValue(8, procDefId_);
		setValue(9, causeIncidentId_);
		setValue(10, rootCauseIncidentId_);
		setValue(11, configuration_);
	}
}