package org.jv.altenshop.orders.orderservice;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.jv.altenshop.orders.ordermodel.Order;
import org.jv.altenshop.orders.orderrepository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderServiceImpl implements OrderService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	@Autowired
	private OrderRepository orderRepository;
	
	/**
	 * TODO : erreur si le order existe déjà.
	 */
	@Override
	public void createOrder(Order order) {
		this.orderRepository.save(order);
	}
	
	@Override
	public Iterable<Order> readAllOrders() {
		return this.orderRepository.findAll();
	}
	
	@Override
	public Optional<Order> readOrderById(Integer id) {
		return this.orderRepository.findById(id);
	}
	
	@Override
	public void deleteOrder(Integer orderId) {
		this.orderRepository.deleteById(orderId);
	}
	
	@Override
	public void deleteAllOrders() {
		this.orderRepository.deleteAll();
	}
	
}
