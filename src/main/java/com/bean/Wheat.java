package com.bean;

import java.util.Date;

public class Wheat extends Item {

	private WheatPkt wheatpkt;

	public Wheat(int id, String description, float weight, float price, Date manufacturing_Date, String months,
			Date expiry_Date, WheatPkt wheatpkt) {
		super(id, description, weight, price, manufacturing_Date, months, expiry_Date);
		this.wheatpkt = wheatpkt;
	}

	public WheatPkt getWheatpkt() {
		return wheatpkt;
	}

	public void setWheatpkt(WheatPkt wheatpkt) {
		this.wheatpkt = wheatpkt;
	}
	
	
}
