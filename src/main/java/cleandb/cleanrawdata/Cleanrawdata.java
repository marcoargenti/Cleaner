/**
 * This class is generated by jOOQ
 */
package cleandb.cleanrawdata;

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
public class Cleanrawdata extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1557227613;

	/**
	 * The reference instance of <code>CleanRawData</code>
	 */
	public static final Cleanrawdata CLEANRAWDATA = new Cleanrawdata();

	/**
	 * No further instances allowed
	 */
	private Cleanrawdata() {
		super("CleanRawData");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			cleandb.cleanrawdata.tables.Construct.CONSTRUCT,
			cleandb.cleanrawdata.tables.Environmentdata.ENVIRONMENTDATA,
			cleandb.cleanrawdata.tables.Experiment.EXPERIMENT,
			cleandb.cleanrawdata.tables.Process.PROCESS);
	}
}