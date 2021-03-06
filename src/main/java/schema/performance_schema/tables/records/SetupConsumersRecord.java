/**
 * This class is generated by jOOQ
 */
package schema.performance_schema.tables.records;

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
public class SetupConsumersRecord extends org.jooq.impl.TableRecordImpl<schema.performance_schema.tables.records.SetupConsumersRecord> implements org.jooq.Record2<java.lang.String, schema.performance_schema.enums.SetupConsumersEnabled> {

	private static final long serialVersionUID = 54985453;

	/**
	 * Setter for <code>performance_schema.setup_consumers.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_consumers.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.setup_consumers.ENABLED</code>.
	 */
	public void setEnabled(schema.performance_schema.enums.SetupConsumersEnabled value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_consumers.ENABLED</code>.
	 */
	public schema.performance_schema.enums.SetupConsumersEnabled getEnabled() {
		return (schema.performance_schema.enums.SetupConsumersEnabled) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, schema.performance_schema.enums.SetupConsumersEnabled> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, schema.performance_schema.enums.SetupConsumersEnabled> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<schema.performance_schema.enums.SetupConsumersEnabled> field2() {
		return schema.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS.ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.performance_schema.enums.SetupConsumersEnabled value2() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupConsumersRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupConsumersRecord value2(schema.performance_schema.enums.SetupConsumersEnabled value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupConsumersRecord values(java.lang.String value1, schema.performance_schema.enums.SetupConsumersEnabled value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SetupConsumersRecord
	 */
	public SetupConsumersRecord() {
		super(schema.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS);
	}

	/**
	 * Create a detached, initialised SetupConsumersRecord
	 */
	public SetupConsumersRecord(java.lang.String name, schema.performance_schema.enums.SetupConsumersEnabled enabled) {
		super(schema.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS);

		setValue(0, name);
		setValue(1, enabled);
	}
}
