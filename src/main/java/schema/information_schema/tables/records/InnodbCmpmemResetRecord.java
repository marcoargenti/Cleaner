/**
 * This class is generated by jOOQ
 */
package schema.information_schema.tables.records;

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
public class InnodbCmpmemResetRecord extends org.jooq.impl.TableRecordImpl<schema.information_schema.tables.records.InnodbCmpmemResetRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer> {

	private static final long serialVersionUID = -173679884;

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM_RESET.page_size</code>.
	 */
	public void setPageSize(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM_RESET.page_size</code>.
	 */
	public java.lang.Integer getPageSize() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM_RESET.buffer_pool_instance</code>.
	 */
	public void setBufferPoolInstance(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM_RESET.buffer_pool_instance</code>.
	 */
	public java.lang.Integer getBufferPoolInstance() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM_RESET.pages_used</code>.
	 */
	public void setPagesUsed(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM_RESET.pages_used</code>.
	 */
	public java.lang.Integer getPagesUsed() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM_RESET.pages_free</code>.
	 */
	public void setPagesFree(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM_RESET.pages_free</code>.
	 */
	public java.lang.Integer getPagesFree() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM_RESET.relocation_ops</code>.
	 */
	public void setRelocationOps(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM_RESET.relocation_ops</code>.
	 */
	public java.lang.Long getRelocationOps() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM_RESET.relocation_time</code>.
	 */
	public void setRelocationTime(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM_RESET.relocation_time</code>.
	 */
	public java.lang.Integer getRelocationTime() {
		return (java.lang.Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET.PAGE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET.BUFFER_POOL_INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET.PAGES_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET.PAGES_FREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET.RELOCATION_OPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET.RELOCATION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getPageSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBufferPoolInstance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getPagesUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getPagesFree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getRelocationOps();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getRelocationTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord value1(java.lang.Integer value) {
		setPageSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord value2(java.lang.Integer value) {
		setBufferPoolInstance(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord value3(java.lang.Integer value) {
		setPagesUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord value4(java.lang.Integer value) {
		setPagesFree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord value5(java.lang.Long value) {
		setRelocationOps(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord value6(java.lang.Integer value) {
		setRelocationTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemResetRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Long value5, java.lang.Integer value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbCmpmemResetRecord
	 */
	public InnodbCmpmemResetRecord() {
		super(schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET);
	}

	/**
	 * Create a detached, initialised InnodbCmpmemResetRecord
	 */
	public InnodbCmpmemResetRecord(java.lang.Integer pageSize, java.lang.Integer bufferPoolInstance, java.lang.Integer pagesUsed, java.lang.Integer pagesFree, java.lang.Long relocationOps, java.lang.Integer relocationTime) {
		super(schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET);

		setValue(0, pageSize);
		setValue(1, bufferPoolInstance);
		setValue(2, pagesUsed);
		setValue(3, pagesFree);
		setValue(4, relocationOps);
		setValue(5, relocationTime);
	}
}