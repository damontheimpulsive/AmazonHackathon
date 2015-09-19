package com.amazon.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.amazon.util.PropertyUtil;

/**
 * This Class Manages the DataBase Connection Creation.Creates a connection
 * object named connection .
 * 
 */

public class DataManager {
	private Connection connection;

	public void createConnection() throws SQLException {
		try {
			Class.forName(com.amazon.util.PropertyUtil.getDataBaseDriver())
					.newInstance();
			// con=DriverManager.getConnection(DBIntializer.CON_STRING,DBIntializer.USERNAME,DBIntializer.PASSWORD);
			// DriverManager.registerDriver(driver); // Registers the Driver
			// object
			// with DriverManager
			// String url="jdbc:mysql://127.0.0.1:3306/Pharma";
			setConnection(DriverManager.getConnection(
					PropertyUtil.getDataBaseUrl(),
					PropertyUtil.getDataBaseUserName(),
					PropertyUtil.getDataBasePassWord()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	public Connection getConnection() {
		return connection;
	}
}
