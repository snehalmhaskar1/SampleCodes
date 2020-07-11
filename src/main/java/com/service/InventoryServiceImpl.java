package com.service;

import java.util.List;

import com.bean.Item;
import com.dao.InventoryDAO;

public class InventoryServiceImpl implements InventoryService{

	InventoryDAO dao;
	
	public List<Item> readAllItemsFromDb() {
		List<Item> items = dao.readAllItemsFromDb();
		return items;
	}

}
