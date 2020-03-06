package com.capgemini.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.dao.OrderDao;
import com.capgemini.dto.Order;
import com.capgemini.exceptions.OrderException;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {

	private OrderServiceImpl target;
	private Order order;
	@Mock			//creates mock object of the OrderDao class
	private OrderDao orderDao;
	private int orderId;
	
	@Before
	public void setUp() throws Exception {
		target = new OrderServiceImpl();
		order = new Order();
		target.setOrderDao(orderDao);
		
		//MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
		target = null;
	}

	@Test
	public void testPlaceOrderShouldPlaceOrderSuccessfully() throws OrderException, SQLException {		
		when(orderDao.create(order)).thenReturn(1);
		boolean result = target.placeOrder(order);
		assertTrue(result);
		verify(orderDao,times(1)).create(order);
	}
	@Test
	public void testPlaceOrderShouldNotPlaceOrder() throws SQLException, OrderException {
		when(orderDao.create(order)).thenReturn(0);
		assertFalse(target.placeOrder(order));
	}
	
	@Test(expected = OrderException.class)
	public void testPlaceOrderShouldThrowOrderException() throws OrderException, SQLException {
		when(orderDao.create(order)).thenThrow(SQLException.class);
		target.placeOrder(order);
	}

	@Test
	public void testDeleteOrderShouldDeleteOrder() throws SQLException, OrderException {
		when(orderDao.delete(orderId)).thenReturn(1);
		target.deleteOrder(orderId);
	}
	
	@Test
	public void testDeleteOrderShouldNotDeleteorder() throws OrderException, SQLException {
		when(orderDao.delete(orderId)).thenReturn(0);
		target.deleteOrder(orderId);
	}
	
	@Test(expected = OrderException.class)
	public void testDeleteOrderShouldThrowOrderException() throws SQLException, OrderException {
		when(orderDao.delete(orderId)).thenThrow(SQLException.class);
		target.deleteOrder(orderId);
	}
	
	@Test
	public void testCancelOrderShouldCancelOrder() throws SQLException, OrderException {
		when(orderDao.read(orderId)).thenReturn(order);
		when(orderDao.update(order)).thenReturn(1);
		assertTrue(target.cancelOrder(orderId));
	}
	
	@Test
	public void testCancelOrderShouldNotCancelOrder() throws SQLException, OrderException {
		when(orderDao.read(orderId)).thenReturn(order);
		when(orderDao.update(order)).thenReturn(0);
		assertFalse(target.cancelOrder(orderId));
	}
	
	@Test(expected = OrderException.class)
	public void testCancelOrderShouldThrowException() throws SQLException, OrderException {
		when(orderDao.read(orderId)).thenReturn(order);
		when(orderDao.update(order)).thenThrow(SQLException.class);
		assertTrue(target.cancelOrder(orderId));
	}
}
