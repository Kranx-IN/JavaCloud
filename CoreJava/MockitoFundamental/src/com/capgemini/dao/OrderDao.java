package com.capgemini.dao;

import java.sql.SQLException;

import com.capgemini.dto.Order;

public interface OrderDao {
	public int create(Order order) throws SQLException;
	public Order read(int orderId) throws SQLException;
	public int update(Order order) throws SQLException;
	public int delete(int orderId) throws SQLException;
}
