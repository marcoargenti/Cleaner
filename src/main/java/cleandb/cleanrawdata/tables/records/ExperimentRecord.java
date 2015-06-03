/**
 * This class is generated by jOOQ
 */
package cleandb.cleanrawdata.tables.records;

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
public class ExperimentRecord extends org.jooq.impl.UpdatableRecordImpl<cleandb.cleanrawdata.tables.records.ExperimentRecord> implements org.jooq.Record3<byte[], java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -1970908566;

	/**
	 * Setter for <code>CleanRawData.Experiment.TrialID</code>.
	 */
	public void setTrialid(byte[] value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>CleanRawData.Experiment.TrialID</code>.
	 */
	public byte[] getTrialid() {
		return (byte[]) getValue(0);
	}

	/**
	 * Setter for <code>CleanRawData.Experiment.ExperimentID</code>.
	 */
	public void setExperimentid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>CleanRawData.Experiment.ExperimentID</code>.
	 */
	public java.lang.String getExperimentid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>CleanRawData.Experiment.ReplicationNum</code>.
	 */
	public void setReplicationnum(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>CleanRawData.Experiment.ReplicationNum</code>.
	 */
	public java.lang.Integer getReplicationnum() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<byte[]> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<byte[], java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<byte[], java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field1() {
		return cleandb.cleanrawdata.tables.Experiment.EXPERIMENT.TRIALID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.cleanrawdata.tables.Experiment.EXPERIMENT.EXPERIMENTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return cleandb.cleanrawdata.tables.Experiment.EXPERIMENT.REPLICATIONNUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value1() {
		return getTrialid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getExperimentid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getReplicationnum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value1(byte[] value) {
		setTrialid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value2(java.lang.String value) {
		setExperimentid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value3(java.lang.Integer value) {
		setReplicationnum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord values(byte[] value1, java.lang.String value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentRecord
	 */
	public ExperimentRecord() {
		super(cleandb.cleanrawdata.tables.Experiment.EXPERIMENT);
	}

	/**
	 * Create a detached, initialised ExperimentRecord
	 */
	public ExperimentRecord(byte[] trialid, java.lang.String experimentid, java.lang.Integer replicationnum) {
		super(cleandb.cleanrawdata.tables.Experiment.EXPERIMENT);

		setValue(0, trialid);
		setValue(1, experimentid);
		setValue(2, replicationnum);
	}
}