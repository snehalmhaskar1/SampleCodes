package com.bean;

import java.util.Date;

public class Milk extends Item {

	private MilkPkt milkpkt;
	private float fatpercentage;
	public Milk(int id, String description, float weight, float price, Date manufacturing_Date, String months,
			Date expiry_Date, MilkPkt milkpkt, float fatpercentage) {
		super(id, description, weight, price, manufacturing_Date, months, expiry_Date);
		this.milkpkt = milkpkt;
		this.fatpercentage = fatpercentage;
	}
	public MilkPkt getMilkpkt() {
		return milkpkt;
	}
	public void setMilkpkt(MilkPkt milkpkt) {
		this.milkpkt = milkpkt;
	}
	public float getFatpercentage() {
		return fatpercentage;
	}
	public void setFatpercentage(float fatpercentage) {
		this.fatpercentage = fatpercentage;
	}
	
}
