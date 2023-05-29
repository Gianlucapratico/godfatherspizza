package com.example.godfatherspizza.model;

public class Pizza extends MenuItem {
	private boolean hasToppings;
	private boolean hasLargerSize;

	public Pizza(String name, double price, boolean hasToppings, boolean hasLargerSize) {
		super(name, price);
		this.hasToppings = hasToppings;
		this.hasLargerSize = hasLargerSize;
	}

	public boolean isHasToppings() {
		return hasToppings;
	}

	public boolean isHasLargerSize() {
		return hasLargerSize;
	}
}
