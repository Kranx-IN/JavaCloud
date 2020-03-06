package com.capgemini.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import com.capgemini.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public int createEmployee(Employee employee) {
		String query = "insert into emp(emp_id,emp_name,sal,dept_id,doj) values (?,?,?,?,?)";
		int result = 0;
		try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
		){
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getEmployeeName());
			preparedStatement.setDouble(3, employee.getEmployeeSalary());
			preparedStatement.setInt(4, employee.getDepartmentId());
			preparedStatement.setDate(5, Date.valueOf(employee.getEmployeeDOJ()));
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee employee = null;
		try(
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement statement = connection.createStatement();
		){
			String sql = "Select * from emp where emp_id = " + employeeId;
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				int empId = resultSet.getInt("emp_id");
				String ename = resultSet.getString("emp_name");
				double empsal = resultSet.getDouble("sal");
				int deptid = resultSet.getInt("dept_id");
				LocalDate doj = resultSet.getDate("doj").toLocalDate();							
				employee = new Employee(empId, ename, empsal, deptid, doj);
			}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return employee;
	}		
}
