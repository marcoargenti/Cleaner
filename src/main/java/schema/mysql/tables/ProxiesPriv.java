/**
 * This class is generated by jOOQ
 */
package schema.mysql.tables;

/**
 * User proxy privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProxiesPriv extends org.jooq.impl.TableImpl<schema.mysql.tables.records.ProxiesPrivRecord> {

	private static final long serialVersionUID = -1314107838;

	/**
	 * The reference instance of <code>mysql.proxies_priv</code>
	 */
	public static final schema.mysql.tables.ProxiesPriv PROXIES_PRIV = new schema.mysql.tables.ProxiesPriv();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.mysql.tables.records.ProxiesPrivRecord> getRecordType() {
		return schema.mysql.tables.records.ProxiesPrivRecord.class;
	}

	/**
	 * The column <code>mysql.proxies_priv.Host</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.lang.String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proxies_priv.User</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.lang.String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proxies_priv.Proxied_host</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.lang.String> PROXIED_HOST = createField("Proxied_host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proxies_priv.Proxied_user</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.lang.String> PROXIED_USER = createField("Proxied_user", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proxies_priv.With_grant</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.lang.Byte> WITH_GRANT = createField("With_grant", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proxies_priv.Grantor</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.lang.String> GRANTOR = createField("Grantor", org.jooq.impl.SQLDataType.CHAR.length(77).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proxies_priv.Timestamp</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.ProxiesPrivRecord, java.sql.Timestamp> TIMESTAMP = createField("Timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mysql.proxies_priv</code> table reference
	 */
	public ProxiesPriv() {
		this("proxies_priv", null);
	}

	/**
	 * Create an aliased <code>mysql.proxies_priv</code> table reference
	 */
	public ProxiesPriv(java.lang.String alias) {
		this(alias, schema.mysql.tables.ProxiesPriv.PROXIES_PRIV);
	}

	private ProxiesPriv(java.lang.String alias, org.jooq.Table<schema.mysql.tables.records.ProxiesPrivRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProxiesPriv(java.lang.String alias, org.jooq.Table<schema.mysql.tables.records.ProxiesPrivRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.mysql.Mysql.MYSQL, aliased, parameters, "User proxy privileges");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<schema.mysql.tables.records.ProxiesPrivRecord> getPrimaryKey() {
		return schema.mysql.Keys.KEY_PROXIES_PRIV_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<schema.mysql.tables.records.ProxiesPrivRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<schema.mysql.tables.records.ProxiesPrivRecord>>asList(schema.mysql.Keys.KEY_PROXIES_PRIV_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.mysql.tables.ProxiesPriv as(java.lang.String alias) {
		return new schema.mysql.tables.ProxiesPriv(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.mysql.tables.ProxiesPriv rename(java.lang.String name) {
		return new schema.mysql.tables.ProxiesPriv(name, null);
	}
}