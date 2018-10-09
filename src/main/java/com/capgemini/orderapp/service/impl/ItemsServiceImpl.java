package com.capgemini.orderapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.orderapp.entity.Items;
import com.capgemini.orderapp.repository.ItemsRepository;
import com.capgemini.orderapp.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsRepository itemsRepository;

	@Override
	public void addLineItem(Items item) {
		itemsRepository.save(item);
	}

	@Override
	public void removeLineItem(Items item) {
		itemsRepository.delete(item);
	}

	@Override
	public List<Items> getItems() {
		return itemsRepository.findAll();
	}

}
