package com.capgemini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo1 {

	public static void main(String[] args) {
		// DriverManager .deregisterDriver(new Driver());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "hr", "hr");
			if (con != null) {
				System.out.println("Connection to db is successful.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
