/**
 * This class is generated by jOOQ
 */
package cleandb.performance_schema.tables.records;

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
public class PerformanceTimersRecord extends org.jooq.impl.TableRecordImpl<cleandb.performance_schema.tables.records.PerformanceTimersRecord> implements org.jooq.Record4<cleandb.performance_schema.enums.PerformanceTimersTimerName, java.lang.Long, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -1661811657;

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
	 */
	public void setTimerName(cleandb.performance_schema.enums.PerformanceTimersTimerName value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
	 */
	public cleandb.performance_schema.enums.PerformanceTimersTimerName getTimerName() {
		return (cleandb.performance_schema.enums.PerformanceTimersTimerName) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
	 */
	public void setTimerFrequency(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
	 */
	public java.lang.Long getTimerFrequency() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
	 */
	public void setTimerResolution(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
	 */
	public java.lang.Long getTimerResolution() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
	 */
	public void setTimerOverhead(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
	 */
	public java.lang.Long getTimerOverhead() {
		return (java.lang.Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<cleandb.performance_schema.enums.PerformanceTimersTimerName, java.lang.Long, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<cleandb.performance_schema.enums.PerformanceTimersTimerName, java.lang.Long, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<cleandb.performance_schema.enums.PerformanceTimersTimerName> field1() {
		return cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS.TIMER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS.TIMER_FREQUENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS.TIMER_RESOLUTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS.TIMER_OVERHEAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.performance_schema.enums.PerformanceTimersTimerName value1() {
		return getTimerName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getTimerFrequency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getTimerResolution();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getTimerOverhead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value1(cleandb.performance_schema.enums.PerformanceTimersTimerName value) {
		setTimerName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value2(java.lang.Long value) {
		setTimerFrequency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value3(java.lang.Long value) {
		setTimerResolution(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value4(java.lang.Long value) {
		setTimerOverhead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord values(cleandb.performance_schema.enums.PerformanceTimersTimerName value1, java.lang.Long value2, java.lang.Long value3, java.lang.Long value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PerformanceTimersRecord
	 */
	public PerformanceTimersRecord() {
		super(cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS);
	}

	/**
	 * Create a detached, initialised PerformanceTimersRecord
	 */
	public PerformanceTimersRecord(cleandb.performance_schema.enums.PerformanceTimersTimerName timerName, java.lang.Long timerFrequency, java.lang.Long timerResolution, java.lang.Long timerOverhead) {
		super(cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS);

		setValue(0, timerName);
		setValue(1, timerFrequency);
		setValue(2, timerResolution);
		setValue(3, timerOverhead);
	}
}
