package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtils {

	private static Connection con;

	public synchronized static Connection getInstance() {
		if (null != con) {
			return con;
		} else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return con;
	}

}
