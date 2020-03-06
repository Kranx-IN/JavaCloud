package com.capgemini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) {
		// DriverManager .deregisterDriver(new Driver());
		ResultSet rs = null;
		Statement stmt = null;
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection(url, "hr", "hr");
			if (con != null) {
				System.out.println("Connection to db is successful.");
				stmt = con.createStatement();
				String query = "select * from emp";
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					int eid = rs.getInt("emp_id");
					String ename = rs.getString("emp_name");
					double esal = rs.getDouble("sal");

					System.out.printf("%d, %s, %f", eid, ename, esal);
					System.out.println();
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
