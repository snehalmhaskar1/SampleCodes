package com.service;

import java.util.List;

import com.bean.Item;

public interface InventoryService {

	public List<Item> readAllItemsFromDb();
} 
