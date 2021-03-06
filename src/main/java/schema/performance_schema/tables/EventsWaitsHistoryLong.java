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
public class EventsWaitsHistoryLong extends org.jooq.impl.TableImpl<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord> {

	private static final long serialVersionUID = -710090927;

	/**
	 * The reference instance of <code>performance_schema.events_waits_history_long</code>
	 */
	public static final schema.performance_schema.tables.EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = new schema.performance_schema.tables.EventsWaitsHistoryLong();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord> getRecordType() {
		return schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_history_long.THREAD_ID</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.Integer> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.EVENT_ID</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.SOURCE</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.TIMER_START</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.TIMER_END</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.SPINS</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.UInteger> SPINS = createField("SPINS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.OBJECT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.OBJECT_NAME</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.OBJECT_TYPE</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.Long> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.NESTING_EVENT_ID</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.OPERATION</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, java.lang.String> OPERATION = createField("OPERATION", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.NUMBER_OF_BYTES</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.ULong> NUMBER_OF_BYTES = createField("NUMBER_OF_BYTES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_history_long.FLAGS</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord, org.jooq.types.UInteger> FLAGS = createField("FLAGS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

	/**
	 * Create a <code>performance_schema.events_waits_history_long</code> table reference
	 */
	public EventsWaitsHistoryLong() {
		this("events_waits_history_long", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_history_long</code> table reference
	 */
	public EventsWaitsHistoryLong(java.lang.String alias) {
		this(alias, schema.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG);
	}

	private EventsWaitsHistoryLong(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsHistoryLong(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.EventsWaitsHistoryLongRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.performance_schema.tables.EventsWaitsHistoryLong as(java.lang.String alias) {
		return new schema.performance_schema.tables.EventsWaitsHistoryLong(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.performance_schema.tables.EventsWaitsHistoryLong rename(java.lang.String name) {
		return new schema.performance_schema.tables.EventsWaitsHistoryLong(name, null);
	}
}
