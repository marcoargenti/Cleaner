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
public class FileSummaryByEventName extends org.jooq.impl.TableImpl<schema.performance_schema.tables.records.FileSummaryByEventNameRecord> {

	private static final long serialVersionUID = -1222837289;

	/**
	 * The reference instance of <code>performance_schema.file_summary_by_event_name</code>
	 */
	public static final schema.performance_schema.tables.FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = new schema.performance_schema.tables.FileSummaryByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.performance_schema.tables.records.FileSummaryByEventNameRecord> getRecordType() {
		return schema.performance_schema.tables.records.FileSummaryByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.file_summary_by_event_name.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.FileSummaryByEventNameRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.file_summary_by_event_name.COUNT_READ</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.FileSummaryByEventNameRecord, org.jooq.types.ULong> COUNT_READ = createField("COUNT_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.file_summary_by_event_name.COUNT_WRITE</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.FileSummaryByEventNameRecord, org.jooq.types.ULong> COUNT_WRITE = createField("COUNT_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.FileSummaryByEventNameRecord, org.jooq.types.ULong> SUM_NUMBER_OF_BYTES_READ = createField("SUM_NUMBER_OF_BYTES_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.FileSummaryByEventNameRecord, org.jooq.types.ULong> SUM_NUMBER_OF_BYTES_WRITE = createField("SUM_NUMBER_OF_BYTES_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.file_summary_by_event_name</code> table reference
	 */
	public FileSummaryByEventName() {
		this("file_summary_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.file_summary_by_event_name</code> table reference
	 */
	public FileSummaryByEventName(java.lang.String alias) {
		this(alias, schema.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME);
	}

	private FileSummaryByEventName(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.FileSummaryByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private FileSummaryByEventName(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.FileSummaryByEventNameRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.performance_schema.tables.FileSummaryByEventName as(java.lang.String alias) {
		return new schema.performance_schema.tables.FileSummaryByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.performance_schema.tables.FileSummaryByEventName rename(java.lang.String name) {
		return new schema.performance_schema.tables.FileSummaryByEventName(name, null);
	}
}
