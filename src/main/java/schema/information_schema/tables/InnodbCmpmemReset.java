/**
 * This class is generated by jOOQ
 */
package schema.information_schema.tables;

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
public class InnodbCmpmemReset extends org.jooq.impl.TableImpl<schema.information_schema.tables.records.InnodbCmpmemResetRecord> {

	private static final long serialVersionUID = 503137720;

	/**
	 * The reference instance of <code>information_schema.INNODB_CMPMEM_RESET</code>
	 */
	public static final schema.information_schema.tables.InnodbCmpmemReset INNODB_CMPMEM_RESET = new schema.information_schema.tables.InnodbCmpmemReset();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.information_schema.tables.records.InnodbCmpmemResetRecord> getRecordType() {
		return schema.information_schema.tables.records.InnodbCmpmemResetRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_CMPMEM_RESET.page_size</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.InnodbCmpmemResetRecord, java.lang.Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM_RESET.buffer_pool_instance</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.InnodbCmpmemResetRecord, java.lang.Integer> BUFFER_POOL_INSTANCE = createField("buffer_pool_instance", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_used</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.InnodbCmpmemResetRecord, java.lang.Integer> PAGES_USED = createField("pages_used", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_free</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.InnodbCmpmemResetRecord, java.lang.Integer> PAGES_FREE = createField("pages_free", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_ops</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.InnodbCmpmemResetRecord, java.lang.Long> RELOCATION_OPS = createField("relocation_ops", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_time</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.InnodbCmpmemResetRecord, java.lang.Integer> RELOCATION_TIME = createField("relocation_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
	 */
	public InnodbCmpmemReset() {
		this("INNODB_CMPMEM_RESET", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
	 */
	public InnodbCmpmemReset(java.lang.String alias) {
		this(alias, schema.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET);
	}

	private InnodbCmpmemReset(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.InnodbCmpmemResetRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbCmpmemReset(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.InnodbCmpmemResetRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.information_schema.tables.InnodbCmpmemReset as(java.lang.String alias) {
		return new schema.information_schema.tables.InnodbCmpmemReset(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.information_schema.tables.InnodbCmpmemReset rename(java.lang.String name) {
		return new schema.information_schema.tables.InnodbCmpmemReset(name, null);
	}
}