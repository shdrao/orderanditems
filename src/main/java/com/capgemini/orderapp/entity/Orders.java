package com.capgemini.orderapp.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Orders {
	@Id
	private int orderId;
	private double orderTotal;
	private LocalDate orderDate;
	private int customerId;
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Items> items;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderId, double orderTotal, LocalDate orderDate, int customerId, List<Items> items) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate
				+ ", customerId=" + customerId + "]";
	}

}
