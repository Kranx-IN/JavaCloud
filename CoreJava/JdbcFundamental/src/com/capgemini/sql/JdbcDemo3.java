package com.capgemini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class JdbcDemo3 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			DriverManager.registerDriver(new OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			connection = DriverManager.getConnection(url, "hr", "hr");
			if (connection != null) {
				String query = "insert into emp(emp_id,emp_name,sal,dept_id,doj) values(207,'Sashank',4500,110,'15-Feb-2020')";
				preparedStatement = connection.prepareStatement(query);
				int result = preparedStatement.executeUpdate();
				System.out.println(result + " Record got inserted");
			}
		} catch (SQLException e) {
			System.out.println("Exception : " +e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
