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
public class ActIdUserRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActIdUserRecord> implements org.jooq.Record7<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1246287088;

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.REV_</code>.
	 */
	public void setRev_(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.REV_</code>.
	 */
	public java.lang.Integer getRev_() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.FIRST_</code>.
	 */
	public void setFirst_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.FIRST_</code>.
	 */
	public java.lang.String getFirst_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.LAST_</code>.
	 */
	public void setLast_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.LAST_</code>.
	 */
	public java.lang.String getLast_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.EMAIL_</code>.
	 */
	public void setEmail_(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.EMAIL_</code>.
	 */
	public java.lang.String getEmail_() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.PWD_</code>.
	 */
	public void setPwd_(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.PWD_</code>.
	 */
	public java.lang.String getPwd_() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_USER.PICTURE_ID_</code>.
	 */
	public void setPictureId_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_USER.PICTURE_ID_</code>.
	 */
	public java.lang.String getPictureId_() {
		return (java.lang.String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.REV_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.FIRST_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.LAST_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.EMAIL_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.PWD_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActIdUser.ACT_ID_USER.PICTURE_ID_;
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
		return getFirst_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLast_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getEmail_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getPwd_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getPictureId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value2(java.lang.Integer value) {
		setRev_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value3(java.lang.String value) {
		setFirst_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value4(java.lang.String value) {
		setLast_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value5(java.lang.String value) {
		setEmail_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value6(java.lang.String value) {
		setPwd_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord value7(java.lang.String value) {
		setPictureId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdUserRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActIdUserRecord
	 */
	public ActIdUserRecord() {
		super(schema.process_engine.tables.ActIdUser.ACT_ID_USER);
	}

	/**
	 * Create a detached, initialised ActIdUserRecord
	 */
	public ActIdUserRecord(java.lang.String id_, java.lang.Integer rev_, java.lang.String first_, java.lang.String last_, java.lang.String email_, java.lang.String pwd_, java.lang.String pictureId_) {
		super(schema.process_engine.tables.ActIdUser.ACT_ID_USER);

		setValue(0, id_);
		setValue(1, rev_);
		setValue(2, first_);
		setValue(3, last_);
		setValue(4, email_);
		setValue(5, pwd_);
		setValue(6, pictureId_);
	}
}
