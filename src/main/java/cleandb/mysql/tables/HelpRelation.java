/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables;

/**
 * keyword-topic relation
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpRelation extends org.jooq.impl.TableImpl<cleandb.mysql.tables.records.HelpRelationRecord> {

	private static final long serialVersionUID = 1419950643;

	/**
	 * The reference instance of <code>mysql.help_relation</code>
	 */
	public static final cleandb.mysql.tables.HelpRelation HELP_RELATION = new cleandb.mysql.tables.HelpRelation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.mysql.tables.records.HelpRelationRecord> getRecordType() {
		return cleandb.mysql.tables.records.HelpRelationRecord.class;
	}

	/**
	 * The column <code>mysql.help_relation.help_topic_id</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpRelationRecord, org.jooq.types.UInteger> HELP_TOPIC_ID = createField("help_topic_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.help_relation.help_keyword_id</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpRelationRecord, org.jooq.types.UInteger> HELP_KEYWORD_ID = createField("help_keyword_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>mysql.help_relation</code> table reference
	 */
	public HelpRelation() {
		this("help_relation", null);
	}

	/**
	 * Create an aliased <code>mysql.help_relation</code> table reference
	 */
	public HelpRelation(java.lang.String alias) {
		this(alias, cleandb.mysql.tables.HelpRelation.HELP_RELATION);
	}

	private HelpRelation(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.HelpRelationRecord> aliased) {
		this(alias, aliased, null);
	}

	private HelpRelation(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.HelpRelationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.mysql.Mysql.MYSQL, aliased, parameters, "keyword-topic relation");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cleandb.mysql.tables.records.HelpRelationRecord> getPrimaryKey() {
		return cleandb.mysql.Keys.KEY_HELP_RELATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cleandb.mysql.tables.records.HelpRelationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cleandb.mysql.tables.records.HelpRelationRecord>>asList(cleandb.mysql.Keys.KEY_HELP_RELATION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.mysql.tables.HelpRelation as(java.lang.String alias) {
		return new cleandb.mysql.tables.HelpRelation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.mysql.tables.HelpRelation rename(java.lang.String name) {
		return new cleandb.mysql.tables.HelpRelation(name, null);
	}
}
