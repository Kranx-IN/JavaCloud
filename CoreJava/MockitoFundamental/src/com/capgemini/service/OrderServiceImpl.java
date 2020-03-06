package com.capgemini.service;

import java.sql.SQLException;

import com.capgemini.dao.OrderDao;
import com.capgemini.dto.Order;
import com.capgemini.exceptions.OrderException;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;
	
	@Override
	public boolean placeOrder(Order order) throws OrderException {
		try {
			int result = orderDao.create(order);
			if(result > 0) {
				return true;
			}
		} catch (SQLException e) {
			throw new OrderException("Problem during placing order",e);
		}
	return false;
	}

	@Override
	public boolean cancelOrder(int orderId) throws OrderException {
		try
		{
			Order order = orderDao.read(orderId);
			order.setStatus("cancelled");
			int result = orderDao.update(order);
			if(result > 0)
			{
				return true;
			}
		}
		catch(SQLException e)
		{
			throw new OrderException("Problem during cancelling order.");
		}
		return false;
	}

	@Override
	public boolean deleteOrder(int orderId) throws OrderException {
		try
		{
			int result = orderDao.delete(orderId);
			if(result > 0)
			{
				return true;
			}
		}
		catch(SQLException e)
		{
			throw new OrderException("Problem during deleting order.");
		}
		return false;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
}
