package com.dao;

import java.util.List;

import com.bean.Item;

public interface InventoryDAO {

	public List<Item> readAllItemsFromDb();
}
