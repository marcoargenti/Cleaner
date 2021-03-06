/**
 * This class is generated by jOOQ
 */
package schema.performance_schema.tables;

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
public class EventsWaitsSummaryByThreadByEventName extends org.jooq.impl.TableImpl<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord> {

	private static final long serialVersionUID = 232351734;

	/**
	 * The reference instance of <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>
	 */
	public static final schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = new schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord> getRecordType() {
		return schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.THREAD_ID</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, java.lang.Integer> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.COUNT_STAR</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, org.jooq.types.ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, org.jooq.types.ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, org.jooq.types.ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, org.jooq.types.ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord, org.jooq.types.ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_waits_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryByThreadByEventName() {
		this("events_waits_summary_by_thread_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryByThreadByEventName(java.lang.String alias) {
		this(alias, schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME);
	}

	private EventsWaitsSummaryByThreadByEventName(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsSummaryByThreadByEventName(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.EventsWaitsSummaryByThreadByEventNameRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName as(java.lang.String alias) {
		return new schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName rename(java.lang.String name) {
		return new schema.performance_schema.tables.EventsWaitsSummaryByThreadByEventName(name, null);
	}
}
