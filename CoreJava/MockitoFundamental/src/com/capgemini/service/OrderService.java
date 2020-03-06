package com.capgemini.service;

import com.capgemini.exceptions.OrderException;

import com.capgemini.dto.Order;

public interface OrderService {
	public boolean placeOrder(Order order) throws OrderException;
	public boolean cancelOrder(int orderId) throws OrderException;
	public boolean deleteOrder(int orderId) throws OrderException;
}
