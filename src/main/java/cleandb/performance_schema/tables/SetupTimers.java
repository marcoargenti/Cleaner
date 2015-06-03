/**
 * This class is generated by jOOQ
 */
package cleandb.performance_schema.tables;

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
public class SetupTimers extends org.jooq.impl.TableImpl<cleandb.performance_schema.tables.records.SetupTimersRecord> {

	private static final long serialVersionUID = -1989033727;

	/**
	 * The reference instance of <code>performance_schema.setup_timers</code>
	 */
	public static final cleandb.performance_schema.tables.SetupTimers SETUP_TIMERS = new cleandb.performance_schema.tables.SetupTimers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.performance_schema.tables.records.SetupTimersRecord> getRecordType() {
		return cleandb.performance_schema.tables.records.SetupTimersRecord.class;
	}

	/**
	 * The column <code>performance_schema.setup_timers.NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.performance_schema.tables.records.SetupTimersRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.setup_timers.TIMER_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.performance_schema.tables.records.SetupTimersRecord, cleandb.performance_schema.enums.SetupTimersTimerName> TIMER_NAME = createField("TIMER_NAME", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(cleandb.performance_schema.enums.SetupTimersTimerName.class), this, "");

	/**
	 * Create a <code>performance_schema.setup_timers</code> table reference
	 */
	public SetupTimers() {
		this("setup_timers", null);
	}

	/**
	 * Create an aliased <code>performance_schema.setup_timers</code> table reference
	 */
	public SetupTimers(java.lang.String alias) {
		this(alias, cleandb.performance_schema.tables.SetupTimers.SETUP_TIMERS);
	}

	private SetupTimers(java.lang.String alias, org.jooq.Table<cleandb.performance_schema.tables.records.SetupTimersRecord> aliased) {
		this(alias, aliased, null);
	}

	private SetupTimers(java.lang.String alias, org.jooq.Table<cleandb.performance_schema.tables.records.SetupTimersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.performance_schema.tables.SetupTimers as(java.lang.String alias) {
		return new cleandb.performance_schema.tables.SetupTimers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.performance_schema.tables.SetupTimers rename(java.lang.String name) {
		return new cleandb.performance_schema.tables.SetupTimers(name, null);
	}
}