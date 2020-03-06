package com.capgemini.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcDemo6 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			connection.setAutoCommit(false);
			
			if (connection != null){
				String query = "delete from emp where emp_id = ?";
				preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setInt(1, 208);
				
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