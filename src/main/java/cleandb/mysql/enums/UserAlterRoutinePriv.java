/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.enums;

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
public enum UserAlterRoutinePriv implements org.jooq.EnumType {

	N("N"),

	Y("Y");

	private final java.lang.String literal;

	private UserAlterRoutinePriv(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "user_Alter_routine_priv";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
