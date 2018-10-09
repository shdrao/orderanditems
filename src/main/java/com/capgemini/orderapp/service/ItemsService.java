package com.capgemini.orderapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.orderapp.entity.Items;
@Service
public interface ItemsService {
	public void addLineItem(Items item);

	public void removeLineItem(Items item);

	public List<Items> getItems();
}
