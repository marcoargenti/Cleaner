/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables.records;

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
public class InnodbLocksRecord extends org.jooq.impl.TableRecordImpl<cleandb.information_schema.tables.records.InnodbLocksRecord> implements org.jooq.Record10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String> {

	private static final long serialVersionUID = -1787851437;

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_id</code>.
	 */
	public void setLockId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_id</code>.
	 */
	public java.lang.String getLockId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_trx_id</code>.
	 */
	public void setLockTrxId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_trx_id</code>.
	 */
	public java.lang.String getLockTrxId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_mode</code>.
	 */
	public void setLockMode(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_mode</code>.
	 */
	public java.lang.String getLockMode() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_type</code>.
	 */
	public void setLockType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_type</code>.
	 */
	public java.lang.String getLockType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_table</code>.
	 */
	public void setLockTable(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_table</code>.
	 */
	public java.lang.String getLockTable() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_index</code>.
	 */
	public void setLockIndex(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_index</code>.
	 */
	public java.lang.String getLockIndex() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_space</code>.
	 */
	public void setLockSpace(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_space</code>.
	 */
	public org.jooq.types.ULong getLockSpace() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_page</code>.
	 */
	public void setLockPage(org.jooq.types.ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_page</code>.
	 */
	public org.jooq.types.ULong getLockPage() {
		return (org.jooq.types.ULong) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_rec</code>.
	 */
	public void setLockRec(org.jooq.types.ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_rec</code>.
	 */
	public org.jooq.types.ULong getLockRec() {
		return (org.jooq.types.ULong) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCKS.lock_data</code>.
	 */
	public void setLockData(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCKS.lock_data</code>.
	 */
	public java.lang.String getLockData() {
		return (java.lang.String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_TRX_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_INDEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field7() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field8() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_PAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field9() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_REC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS.LOCK_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getLockId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getLockTrxId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLockMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLockType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getLockTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getLockIndex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value7() {
		return getLockSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value8() {
		return getLockPage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value9() {
		return getLockRec();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getLockData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value1(java.lang.String value) {
		setLockId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value2(java.lang.String value) {
		setLockTrxId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value3(java.lang.String value) {
		setLockMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value4(java.lang.String value) {
		setLockType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value5(java.lang.String value) {
		setLockTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value6(java.lang.String value) {
		setLockIndex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value7(org.jooq.types.ULong value) {
		setLockSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value8(org.jooq.types.ULong value) {
		setLockPage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value9(org.jooq.types.ULong value) {
		setLockRec(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord value10(java.lang.String value) {
		setLockData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLocksRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, org.jooq.types.ULong value7, org.jooq.types.ULong value8, org.jooq.types.ULong value9, java.lang.String value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbLocksRecord
	 */
	public InnodbLocksRecord() {
		super(cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS);
	}

	/**
	 * Create a detached, initialised InnodbLocksRecord
	 */
	public InnodbLocksRecord(java.lang.String lockId, java.lang.String lockTrxId, java.lang.String lockMode, java.lang.String lockType, java.lang.String lockTable, java.lang.String lockIndex, org.jooq.types.ULong lockSpace, org.jooq.types.ULong lockPage, org.jooq.types.ULong lockRec, java.lang.String lockData) {
		super(cleandb.information_schema.tables.InnodbLocks.INNODB_LOCKS);

		setValue(0, lockId);
		setValue(1, lockTrxId);
		setValue(2, lockMode);
		setValue(3, lockType);
		setValue(4, lockTable);
		setValue(5, lockIndex);
		setValue(6, lockSpace);
		setValue(7, lockPage);
		setValue(8, lockRec);
		setValue(9, lockData);
	}
}