package com.bean;

import java.util.Date;

public class Cheese extends Item {

	

	private CheesePkt cheesepkt;

	public Cheese(int id, String description, float weight, float price, Date manufacturing_Date, String months,
			Date expiry_Date, CheesePkt cheesepkt) {
		super(id, description, weight, price, manufacturing_Date, months, expiry_Date);
		this.cheesepkt = cheesepkt;
	}

	public CheesePkt getCheesepkt() {
		return cheesepkt;
	}

	public void setCheesepkt(CheesePkt cheesepkt) {
		this.cheesepkt = cheesepkt;
	}
	
	
}
