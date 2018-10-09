package com.capgemini.orderapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.orderapp.entity.Orders;
import com.capgemini.orderapp.repository.ItemsRepository;
import com.capgemini.orderapp.repository.OrderRepository;
import com.capgemini.orderapp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ItemsRepository itemsRepository;

	@Override
	public List<Orders> getOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Orders getOrderById(int orderId) {
		Optional<Orders> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isPresent()) {
			return optionalOrder.get();
		} else
			return null;
	}

	@Override
	public void submitOrder(Orders order) {
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Orders order) {
		orderRepository.save(order);

	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepository.deleteById(orderId);
	}

	@Override
	public void cancelOrder(int orderId) {
		orderRepository.deleteById(orderId);
	}

}
