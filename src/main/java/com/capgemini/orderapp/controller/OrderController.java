package com.capgemini.orderapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.entity.Orders;
import com.capgemini.orderapp.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/add")
	public void addProduct(@RequestBody Orders order) {
		orderService.submitOrder(order);
	}

	@DeleteMapping("/delete/{orderId}")
	public void deleteProduct(@PathVariable int orderId) {
		orderService.deleteOrder(orderId);
	}
}