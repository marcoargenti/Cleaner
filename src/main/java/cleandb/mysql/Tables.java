/**
 * This class is generated by jOOQ
 */
package cleandb.mysql;

/**
 * Convenience access to all tables in mysql
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * Column privileges
	 */
	public static final cleandb.mysql.tables.ColumnsPriv COLUMNS_PRIV = cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV;

	/**
	 * Database privileges
	 */
	public static final cleandb.mysql.tables.Db DB = cleandb.mysql.tables.Db.DB;

	/**
	 * Events
	 */
	public static final cleandb.mysql.tables.Event EVENT = cleandb.mysql.tables.Event.EVENT;

	/**
	 * User defined functions
	 */
	public static final cleandb.mysql.tables.Func FUNC = cleandb.mysql.tables.Func.FUNC;

	/**
	 * General log
	 */
	public static final cleandb.mysql.tables.GeneralLog GENERAL_LOG = cleandb.mysql.tables.GeneralLog.GENERAL_LOG;

	/**
	 * help categories
	 */
	public static final cleandb.mysql.tables.HelpCategory HELP_CATEGORY = cleandb.mysql.tables.HelpCategory.HELP_CATEGORY;

	/**
	 * help keywords
	 */
	public static final cleandb.mysql.tables.HelpKeyword HELP_KEYWORD = cleandb.mysql.tables.HelpKeyword.HELP_KEYWORD;

	/**
	 * keyword-topic relation
	 */
	public static final cleandb.mysql.tables.HelpRelation HELP_RELATION = cleandb.mysql.tables.HelpRelation.HELP_RELATION;

	/**
	 * help topics
	 */
	public static final cleandb.mysql.tables.HelpTopic HELP_TOPIC = cleandb.mysql.tables.HelpTopic.HELP_TOPIC;

	/**
	 * Host privileges;  Merged with database privileges
	 */
	public static final cleandb.mysql.tables.Host HOST = cleandb.mysql.tables.Host.HOST;

	/**
	 * The table mysql.ndb_binlog_index
	 */
	public static final cleandb.mysql.tables.NdbBinlogIndex NDB_BINLOG_INDEX = cleandb.mysql.tables.NdbBinlogIndex.NDB_BINLOG_INDEX;

	/**
	 * MySQL plugins
	 */
	public static final cleandb.mysql.tables.Plugin PLUGIN = cleandb.mysql.tables.Plugin.PLUGIN;

	/**
	 * Stored Procedures
	 */
	public static final cleandb.mysql.tables.Proc PROC = cleandb.mysql.tables.Proc.PROC;

	/**
	 * Procedure privileges
	 */
	public static final cleandb.mysql.tables.ProcsPriv PROCS_PRIV = cleandb.mysql.tables.ProcsPriv.PROCS_PRIV;

	/**
	 * User proxy privileges
	 */
	public static final cleandb.mysql.tables.ProxiesPriv PROXIES_PRIV = cleandb.mysql.tables.ProxiesPriv.PROXIES_PRIV;

	/**
	 * MySQL Foreign Servers table
	 */
	public static final cleandb.mysql.tables.Servers SERVERS = cleandb.mysql.tables.Servers.SERVERS;

	/**
	 * Slow log
	 */
	public static final cleandb.mysql.tables.SlowLog SLOW_LOG = cleandb.mysql.tables.SlowLog.SLOW_LOG;

	/**
	 * Table privileges
	 */
	public static final cleandb.mysql.tables.TablesPriv TABLES_PRIV = cleandb.mysql.tables.TablesPriv.TABLES_PRIV;

	/**
	 * Time zones
	 */
	public static final cleandb.mysql.tables.TimeZone TIME_ZONE = cleandb.mysql.tables.TimeZone.TIME_ZONE;

	/**
	 * Leap seconds information for time zones
	 */
	public static final cleandb.mysql.tables.TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = cleandb.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND;

	/**
	 * Time zone names
	 */
	public static final cleandb.mysql.tables.TimeZoneName TIME_ZONE_NAME = cleandb.mysql.tables.TimeZoneName.TIME_ZONE_NAME;

	/**
	 * Time zone transitions
	 */
	public static final cleandb.mysql.tables.TimeZoneTransition TIME_ZONE_TRANSITION = cleandb.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION;

	/**
	 * Time zone transition types
	 */
	public static final cleandb.mysql.tables.TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = cleandb.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE;

	/**
	 * Users and global privileges
	 */
	public static final cleandb.mysql.tables.User USER = cleandb.mysql.tables.User.USER;
}