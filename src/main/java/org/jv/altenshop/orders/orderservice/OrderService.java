package org.jv.altenshop.orders.orderservice;

import java.util.Optional;

import org.jv.altenshop.orders.ordermodel.Order;

public interface OrderService {
	
	/**
	 * CREATE.
	 */
	public void createOrder(Order order);
	
	/**
	 * READ all.
	 */
	public Iterable<Order> readAllOrders();
	
	/**
	 * READ by id.
	 */
	public Optional<Order> readOrderById(Integer id);
	
	// TODO : UPDATE of an existing order.
	
	/**
	 * DELETE by id.
	 */
	public void deleteOrder(Integer orderId);
	
	/**
	 * DELETE all.
	 */
	public void deleteAllOrders();
	
}
