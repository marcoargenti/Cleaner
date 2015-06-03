/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables;

/**
 * Time zone transition types
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionType extends org.jooq.impl.TableImpl<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord> {

	private static final long serialVersionUID = 2037884081;

	/**
	 * The reference instance of <code>mysql.time_zone_transition_type</code>
	 */
	public static final cleandb.mysql.tables.TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = new cleandb.mysql.tables.TimeZoneTransitionType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord> getRecordType() {
		return cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord.class;
	}

	/**
	 * The column <code>mysql.time_zone_transition_type.Time_zone_id</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord, org.jooq.types.UInteger> TIME_ZONE_ID = createField("Time_zone_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Transition_type_id</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord, org.jooq.types.UInteger> TRANSITION_TYPE_ID = createField("Transition_type_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Offset</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord, java.lang.Integer> OFFSET = createField("Offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Is_DST</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord, org.jooq.types.UByte> IS_DST = createField("Is_DST", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Abbreviation</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord, java.lang.String> ABBREVIATION = createField("Abbreviation", org.jooq.impl.SQLDataType.CHAR.length(8).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mysql.time_zone_transition_type</code> table reference
	 */
	public TimeZoneTransitionType() {
		this("time_zone_transition_type", null);
	}

	/**
	 * Create an aliased <code>mysql.time_zone_transition_type</code> table reference
	 */
	public TimeZoneTransitionType(java.lang.String alias) {
		this(alias, cleandb.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE);
	}

	private TimeZoneTransitionType(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private TimeZoneTransitionType(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.mysql.Mysql.MYSQL, aliased, parameters, "Time zone transition types");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord> getPrimaryKey() {
		return cleandb.mysql.Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cleandb.mysql.tables.records.TimeZoneTransitionTypeRecord>>asList(cleandb.mysql.Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.mysql.tables.TimeZoneTransitionType as(java.lang.String alias) {
		return new cleandb.mysql.tables.TimeZoneTransitionType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.mysql.tables.TimeZoneTransitionType rename(java.lang.String name) {
		return new cleandb.mysql.tables.TimeZoneTransitionType(name, null);
	}
}