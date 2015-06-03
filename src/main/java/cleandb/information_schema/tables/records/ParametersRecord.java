/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables.records;

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
public class ParametersRecord extends org.jooq.impl.TableRecordImpl<cleandb.information_schema.tables.records.ParametersRecord> implements org.jooq.Record15<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1349296246;

	/**
	 * Setter for <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
	 */
	public void setSpecificCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
	 */
	public java.lang.String getSpecificCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
	 */
	public void setSpecificSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
	 */
	public java.lang.String getSpecificSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
	 */
	public java.lang.String getSpecificName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
	 */
	public void setOrdinalPosition(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
	 */
	public java.lang.Integer getOrdinalPosition() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
	 */
	public void setParameterMode(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
	 */
	public java.lang.String getParameterMode() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
	 */
	public void setParameterName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
	 */
	public java.lang.String getParameterName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.DATA_TYPE</code>.
	 */
	public void setDataType(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.DATA_TYPE</code>.
	 */
	public java.lang.String getDataType() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public void setCharacterMaximumLength(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public java.lang.Integer getCharacterMaximumLength() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
	 */
	public void setCharacterOctetLength(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
	 */
	public java.lang.Integer getCharacterOctetLength() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
	 */
	public void setNumericPrecision(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
	 */
	public java.lang.Integer getNumericPrecision() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
	 */
	public void setNumericScale(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
	 */
	public java.lang.Integer getNumericScale() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
	 */
	public java.lang.String getCharacterSetName() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
	 */
	public void setCollationName(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
	 */
	public java.lang.String getCollationName() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
	 */
	public void setDtdIdentifier(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
	 */
	public java.lang.String getDtdIdentifier() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
	 */
	public void setRoutineType(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
	 */
	public java.lang.String getRoutineType() {
		return (java.lang.String) getValue(14);
	}

	// -------------------------------------------------------------------------
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.SPECIFIC_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.SPECIFIC_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.SPECIFIC_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.ORDINAL_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.PARAMETER_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.PARAMETER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.CHARACTER_MAXIMUM_LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.CHARACTER_OCTET_LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.NUMERIC_PRECISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.NUMERIC_SCALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.CHARACTER_SET_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.COLLATION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.DTD_IDENTIFIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return cleandb.information_schema.tables.Parameters.PARAMETERS.ROUTINE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getSpecificCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSpecificSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSpecificName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getOrdinalPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getParameterMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getParameterName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getCharacterMaximumLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getCharacterOctetLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getNumericPrecision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getNumericScale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getCharacterSetName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getCollationName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getDtdIdentifier();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getRoutineType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value1(java.lang.String value) {
		setSpecificCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value2(java.lang.String value) {
		setSpecificSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value3(java.lang.String value) {
		setSpecificName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value4(java.lang.Integer value) {
		setOrdinalPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value5(java.lang.String value) {
		setParameterMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value6(java.lang.String value) {
		setParameterName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value7(java.lang.String value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value8(java.lang.Integer value) {
		setCharacterMaximumLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value9(java.lang.Integer value) {
		setCharacterOctetLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value10(java.lang.Integer value) {
		setNumericPrecision(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value11(java.lang.Integer value) {
		setNumericScale(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value12(java.lang.String value) {
		setCharacterSetName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value13(java.lang.String value) {
		setCollationName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value14(java.lang.String value) {
		setDtdIdentifier(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord value15(java.lang.String value) {
		setRoutineType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParametersRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8, java.lang.Integer value9, java.lang.Integer value10, java.lang.Integer value11, java.lang.String value12, java.lang.String value13, java.lang.String value14, java.lang.String value15) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ParametersRecord
	 */
	public ParametersRecord() {
		super(cleandb.information_schema.tables.Parameters.PARAMETERS);
	}

	/**
	 * Create a detached, initialised ParametersRecord
	 */
	public ParametersRecord(java.lang.String specificCatalog, java.lang.String specificSchema, java.lang.String specificName, java.lang.Integer ordinalPosition, java.lang.String parameterMode, java.lang.String parameterName, java.lang.String dataType, java.lang.Integer characterMaximumLength, java.lang.Integer characterOctetLength, java.lang.Integer numericPrecision, java.lang.Integer numericScale, java.lang.String characterSetName, java.lang.String collationName, java.lang.String dtdIdentifier, java.lang.String routineType) {
		super(cleandb.information_schema.tables.Parameters.PARAMETERS);

		setValue(0, specificCatalog);
		setValue(1, specificSchema);
		setValue(2, specificName);
		setValue(3, ordinalPosition);
		setValue(4, parameterMode);
		setValue(5, parameterName);
		setValue(6, dataType);
		setValue(7, characterMaximumLength);
		setValue(8, characterOctetLength);
		setValue(9, numericPrecision);
		setValue(10, numericScale);
		setValue(11, characterSetName);
		setValue(12, collationName);
		setValue(13, dtdIdentifier);
		setValue(14, routineType);
	}
}