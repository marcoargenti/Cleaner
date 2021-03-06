/**
 * This class is generated by jOOQ
 */
package schema.mysql.tables.records;

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
public class HelpRelationRecord extends org.jooq.impl.UpdatableRecordImpl<schema.mysql.tables.records.HelpRelationRecord> implements org.jooq.Record2<org.jooq.types.UInteger, org.jooq.types.UInteger> {

	private static final long serialVersionUID = 831447672;

	/**
	 * Setter for <code>mysql.help_relation.help_topic_id</code>.
	 */
	public void setHelpTopicId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.help_relation.help_topic_id</code>.
	 */
	public org.jooq.types.UInteger getHelpTopicId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>mysql.help_relation.help_keyword_id</code>.
	 */
	public void setHelpKeywordId(org.jooq.types.UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.help_relation.help_keyword_id</code>.
	 */
	public org.jooq.types.UInteger getHelpKeywordId() {
		return (org.jooq.types.UInteger) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<org.jooq.types.UInteger, org.jooq.types.UInteger> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, org.jooq.types.UInteger> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, org.jooq.types.UInteger> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return schema.mysql.tables.HelpRelation.HELP_RELATION.HELP_TOPIC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field2() {
		return schema.mysql.tables.HelpRelation.HELP_RELATION.HELP_KEYWORD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getHelpTopicId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value2() {
		return getHelpKeywordId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRelationRecord value1(org.jooq.types.UInteger value) {
		setHelpTopicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRelationRecord value2(org.jooq.types.UInteger value) {
		setHelpKeywordId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRelationRecord values(org.jooq.types.UInteger value1, org.jooq.types.UInteger value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HelpRelationRecord
	 */
	public HelpRelationRecord() {
		super(schema.mysql.tables.HelpRelation.HELP_RELATION);
	}

	/**
	 * Create a detached, initialised HelpRelationRecord
	 */
	public HelpRelationRecord(org.jooq.types.UInteger helpTopicId, org.jooq.types.UInteger helpKeywordId) {
		super(schema.mysql.tables.HelpRelation.HELP_RELATION);

		setValue(0, helpTopicId);
		setValue(1, helpKeywordId);
	}
}
