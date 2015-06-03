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
public class Schemata extends org.jooq.impl.TableImpl<schema.information_schema.tables.records.SchemataRecord> {

	private static final long serialVersionUID = 1642807222;

	/**
	 * The reference instance of <code>information_schema.SCHEMATA</code>
	 */
	public static final schema.information_schema.tables.Schemata SCHEMATA = new schema.information_schema.tables.Schemata();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.information_schema.tables.records.SchemataRecord> getRecordType() {
		return schema.information_schema.tables.records.SchemataRecord.class;
	}

	/**
	 * The column <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemataRecord, java.lang.String> CATALOG_NAME = createField("CATALOG_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemataRecord, java.lang.String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemataRecord, java.lang.String> DEFAULT_CHARACTER_SET_NAME = createField("DEFAULT_CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemataRecord, java.lang.String> DEFAULT_COLLATION_NAME = createField("DEFAULT_COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.SQL_PATH</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.SchemataRecord, java.lang.String> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * Create a <code>information_schema.SCHEMATA</code> table reference
	 */
	public Schemata() {
		this("SCHEMATA", null);
	}

	/**
	 * Create an aliased <code>information_schema.SCHEMATA</code> table reference
	 */
	public Schemata(java.lang.String alias) {
		this(alias, schema.information_schema.tables.Schemata.SCHEMATA);
	}

	private Schemata(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.SchemataRecord> aliased) {
		this(alias, aliased, null);
	}

	private Schemata(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.SchemataRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.information_schema.tables.Schemata as(java.lang.String alias) {
		return new schema.information_schema.tables.Schemata(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.information_schema.tables.Schemata rename(java.lang.String name) {
		return new schema.information_schema.tables.Schemata(name, null);
	}
}