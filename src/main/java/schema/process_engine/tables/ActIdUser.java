/**
 * This class is generated by jOOQ
 */
package schema.process_engine.tables;

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
public class ActIdUser extends org.jooq.impl.TableImpl<schema.process_engine.tables.records.ActIdUserRecord> {

	private static final long serialVersionUID = -1484250477;

	/**
	 * The reference instance of <code>process-engine.ACT_ID_USER</code>
	 */
	public static final schema.process_engine.tables.ActIdUser ACT_ID_USER = new schema.process_engine.tables.ActIdUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.process_engine.tables.records.ActIdUserRecord> getRecordType() {
		return schema.process_engine.tables.records.ActIdUserRecord.class;
	}

	/**
	 * The column <code>process-engine.ACT_ID_USER.ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.String> ID_ = createField("ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_USER.REV_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.Integer> REV_ = createField("REV_", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>process-engine.ACT_ID_USER.FIRST_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.String> FIRST_ = createField("FIRST_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_USER.LAST_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.String> LAST_ = createField("LAST_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_USER.EMAIL_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.String> EMAIL_ = createField("EMAIL_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_USER.PWD_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.String> PWD_ = createField("PWD_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_USER.PICTURE_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdUserRecord, java.lang.String> PICTURE_ID_ = createField("PICTURE_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * Create a <code>process-engine.ACT_ID_USER</code> table reference
	 */
	public ActIdUser() {
		this("ACT_ID_USER", null);
	}

	/**
	 * Create an aliased <code>process-engine.ACT_ID_USER</code> table reference
	 */
	public ActIdUser(java.lang.String alias) {
		this(alias, schema.process_engine.tables.ActIdUser.ACT_ID_USER);
	}

	private ActIdUser(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActIdUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActIdUser(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActIdUserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.process_engine.Process_engine.PROCESS_ENGINE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<schema.process_engine.tables.records.ActIdUserRecord> getPrimaryKey() {
		return schema.process_engine.Keys.KEY_ACT_ID_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<schema.process_engine.tables.records.ActIdUserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<schema.process_engine.tables.records.ActIdUserRecord>>asList(schema.process_engine.Keys.KEY_ACT_ID_USER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.process_engine.tables.ActIdUser as(java.lang.String alias) {
		return new schema.process_engine.tables.ActIdUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.process_engine.tables.ActIdUser rename(java.lang.String name) {
		return new schema.process_engine.tables.ActIdUser(name, null);
	}
}
