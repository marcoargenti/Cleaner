package cloud.benchflow.cleaner;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import com.mysql.jdbc.Driver;

public class DB {
	String connectionURL;
	String password;
	String user;
	BasicDataSource connectionPool;
	String driver;
	
	
	/**
	 * @param user
	 * @param password
	 * @param url must be formated correctly according URL requirements
	 * @param driver is the driver used to connect to the database; e.g: com.mysql.jdbc.Driver
	 */
	DB(String user, String password, String url, String driver){
		this.connectionURL = url;
		this.user = user;
		this.password = password;
		this.driver = driver;
		this.initPool();
	}
	
	/**
	 * It is the constructor of DB objects and it uses default driver com.mysql.jdbc.Driver.
	 * 
	 * @param user
	 * @param password
	 * @param url must be formated correctly according URL requirements
	 */
	DB(String user, String password, String url){
		this.connectionURL = url;
		this.user = user;
		this.password = password;
		this.driver = "com.mysql.jdbc.Driver";
		this.initPool();
	}
	
	private void initPool(){
		connectionPool = new BasicDataSource();

		connectionPool.setUsername(user);
		connectionPool.setPassword(password);
		connectionPool.setDriverClassName(driver);
		connectionPool.setUrl(connectionURL);
		connectionPool.setInitialSize(1);
	}
	
	/**
	 * connectDB method create a connection to use.
	 * 
	 * @return connection to database
	 */
	Connection connectDB(){
//		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			return DriverManager.getConnection(connectionURL, user, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 

		
		try {
			return connectionPool.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * closeConnection methods close the connection
	 * 
	 * @param conn is an open connection to database
	 */
	void closeConnection(Connection conn){
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
