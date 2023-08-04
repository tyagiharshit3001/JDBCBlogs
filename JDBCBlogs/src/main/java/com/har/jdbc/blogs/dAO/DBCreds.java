package com.har.jdbc.blogs.dAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCreds {
	static String uname = "root";
	static String pass = "password";
	static String url = "jdbc:mysql://localhost:3306/prolifics";
	
	public static Connection getConnect() {
		Connection con =null;
		
		try {
			con = DriverManager.getConnection(url, uname, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	
}
