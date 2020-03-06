package com.capgemini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcDemo5 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int eid = 208;
		String ename = "Danish";
		double esal = 4550;
		int dept = 112;
		String date = "24-Feb-2019";
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			connection.setAutoCommit(false);
			
			if (connection != null){
				String query = "update emp set sal =  sal*0.1 + sal where emp_id = ?";
				preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setInt(1, eid);
				
				int result = preparedStatement.executeUpdate();
				if(result >= 1){
					connection.commit();
					System.out.println(result + " Record got inserted");
				}
			}
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Exception : " +e.getMessage());
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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