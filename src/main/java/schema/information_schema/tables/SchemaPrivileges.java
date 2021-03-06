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
public class SchemaPrivileges extends org.jooq.impl.TableImpl<schema.information_schema.tables.records.SchemaPrivilegesRecord> {

	private static final long serialVersionUID = 1390819214;

	/**
	 * The reference instance of <code>information_schema.SCHEMA_PRIVILEGES</code>
	 */
	public static final schema.information_schema.tables.SchemaPrivileges SCHEMA_PRIVILEGES = new schema.information_schema.tables.SchemaPrivileges();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.information_schema.tables.records.SchemaPrivilegesRecord> getRecordType() {
		return schema.information_schema.tables.records.SchemaPrivilegesRecord.class;
	}

	/**
	 * The column <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemaPrivilegesRecord, java.lang.String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR.length(81).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemaPrivilegesRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemaPrivilegesRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemaPrivilegesRecord, java.lang.String> PRIVILEGE_TYPE = createField("PRIVILEGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemaPrivilegesRecord, java.lang.String> IS_GRANTABLE = createField("IS_GRANTABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.SCHEMA_PRIVILEGES</code> table reference
	 */
	public SchemaPrivileges() {
		this("SCHEMA_PRIVILEGES", null);
	}

	/**
	 * Create an aliased <code>information_schema.SCHEMA_PRIVILEGES</code> table reference
	 */
	public SchemaPrivileges(java.lang.String alias) {
		this(alias, schema.information_schema.tables.SchemaPrivileges.SCHEMA_PRIVILEGES);
	}

	private SchemaPrivileges(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.SchemaPrivilegesRecord> aliased) {
		this(alias, aliased, null);
	}

	private SchemaPrivileges(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.SchemaPrivilegesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.information_schema.tables.SchemaPrivileges as(java.lang.String alias) {
		return new schema.information_schema.tables.SchemaPrivileges(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.information_schema.tables.SchemaPrivileges rename(java.lang.String name) {
		return new schema.information_schema.tables.SchemaPrivileges(name, null);
	}
}
