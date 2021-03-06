/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables;

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
public class Tablespaces extends org.jooq.impl.TableImpl<cleandb.information_schema.tables.records.TablespacesRecord> {

	private static final long serialVersionUID = 1629353973;

	/**
	 * The reference instance of <code>information_schema.TABLESPACES</code>
	 */
	public static final cleandb.information_schema.tables.Tablespaces TABLESPACES = new cleandb.information_schema.tables.Tablespaces();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.information_schema.tables.records.TablespacesRecord> getRecordType() {
		return cleandb.information_schema.tables.records.TablespacesRecord.class;
	}

	/**
	 * The column <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, java.lang.String> TABLESPACE_NAME = createField("TABLESPACE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.ENGINE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, java.lang.String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, java.lang.String> TABLESPACE_TYPE = createField("TABLESPACE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, java.lang.String> LOGFILE_GROUP_NAME = createField("LOGFILE_GROUP_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, org.jooq.types.ULong> EXTENT_SIZE = createField("EXTENT_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, org.jooq.types.ULong> AUTOEXTEND_SIZE = createField("AUTOEXTEND_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, org.jooq.types.ULong> MAXIMUM_SIZE = createField("MAXIMUM_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, org.jooq.types.ULong> NODEGROUP_ID = createField("NODEGROUP_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.TablespacesRecord, java.lang.String> TABLESPACE_COMMENT = createField("TABLESPACE_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(2048), this, "");

	/**
	 * Create a <code>information_schema.TABLESPACES</code> table reference
	 */
	public Tablespaces() {
		this("TABLESPACES", null);
	}

	/**
	 * Create an aliased <code>information_schema.TABLESPACES</code> table reference
	 */
	public Tablespaces(java.lang.String alias) {
		this(alias, cleandb.information_schema.tables.Tablespaces.TABLESPACES);
	}

	private Tablespaces(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.TablespacesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tablespaces(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.TablespacesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.information_schema.tables.Tablespaces as(java.lang.String alias) {
		return new cleandb.information_schema.tables.Tablespaces(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.information_schema.tables.Tablespaces rename(java.lang.String name) {
		return new cleandb.information_schema.tables.Tablespaces(name, null);
	}
}
