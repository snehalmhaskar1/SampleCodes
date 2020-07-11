package com.bean;

import java.util.Date;

abstract public class Item {

	private int	Id ;
	private String	Description;
    private float	Weight;
	private float	Price;  
	private Date	Manufacturing_Date;
	private String  Months;
	private Date	Expiry_Date;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getWeight() {
		return Weight;
	}
	public void setWeight(float weight) {
		Weight = weight;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public Date getManufacturing_Date() {
		return Manufacturing_Date;
	}
	public void setManufacturing_Date(Date manufacturing_Date) {
		Manufacturing_Date = manufacturing_Date;
	}
	public String getMonths() {
		return Months;
	}
	public void setMonths(String months) {
		Months = months;
	}
	public Date getExpiry_Date() {
		return Expiry_Date;
	}
	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}
	public Item(int id, String description, float weight, float price, Date manufacturing_Date, String months,
			Date expiry_Date) {
		super();
		Id = id;
		Description = description;
		Weight = weight;
		Price = price;
		Manufacturing_Date = manufacturing_Date;
		Months = months;
		Expiry_Date = expiry_Date;
	}

}
