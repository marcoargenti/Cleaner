/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables;

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
public class CharacterSets extends org.jooq.impl.TableImpl<cleandb.information_schema.tables.records.CharacterSetsRecord> {

	private static final long serialVersionUID = 258991444;

	/**
	 * The reference instance of <code>information_schema.CHARACTER_SETS</code>
	 */
	public static final cleandb.information_schema.tables.CharacterSets CHARACTER_SETS = new cleandb.information_schema.tables.CharacterSets();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.information_schema.tables.records.CharacterSetsRecord> getRecordType() {
		return cleandb.information_schema.tables.records.CharacterSetsRecord.class;
	}

	/**
	 * The column <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.CharacterSetsRecord, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.CharacterSetsRecord, java.lang.String> DEFAULT_COLLATE_NAME = createField("DEFAULT_COLLATE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.CharacterSetsRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.CharacterSetsRecord, java.lang.Long> MAXLEN = createField("MAXLEN", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.CHARACTER_SETS</code> table reference
	 */
	public CharacterSets() {
		this("CHARACTER_SETS", null);
	}

	/**
	 * Create an aliased <code>information_schema.CHARACTER_SETS</code> table reference
	 */
	public CharacterSets(java.lang.String alias) {
		this(alias, cleandb.information_schema.tables.CharacterSets.CHARACTER_SETS);
	}

	private CharacterSets(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.CharacterSetsRecord> aliased) {
		this(alias, aliased, null);
	}

	private CharacterSets(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.CharacterSetsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.information_schema.tables.CharacterSets as(java.lang.String alias) {
		return new cleandb.information_schema.tables.CharacterSets(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.information_schema.tables.CharacterSets rename(java.lang.String name) {
		return new cleandb.information_schema.tables.CharacterSets(name, null);
	}
}
