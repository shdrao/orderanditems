package com.capgemini.orderapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "it")
public class Items {
	
	@Id
	private int itemId;
	private int itemQuatity;
	private int productId;
	private double itemTotal;
	
	public Items() {
		super();
	}

	public Items(int itemId, int itemQuatity, int productId, double itemTotal) {
		super();
		this.itemId = itemId;
		this.itemQuatity = itemQuatity;
		this.productId = productId;
		this.itemTotal = itemTotal;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemQuatity() {
		return itemQuatity;
	}

	public void setItemQuatity(int itemQuatity) {
		this.itemQuatity = itemQuatity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemQuatity=" + itemQuatity + ", productId=" + productId + ", itemTotal="
				+ itemTotal + "]";
	}

}
