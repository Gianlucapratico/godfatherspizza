package com.example.godfatherspizza.model;

public class Drink extends MenuItem {
	private String nutritionalInfo;

	public Drink(String name, double price, String nutritionalInfo) {
		super(name, price);
		this.nutritionalInfo = nutritionalInfo;
	}

	public String getNutritionalInfo() {
		return nutritionalInfo;
	}
}
