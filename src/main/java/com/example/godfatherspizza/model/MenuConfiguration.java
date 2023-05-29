package com.example.godfatherspizza.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfiguration {

	@Bean
	public List<MenuItem> menuItems() {
		List<MenuItem> menuItems = new ArrayList<>();

		// Pizze
		Pizza margherita = new Pizza("Margherita", 8.99, true, true);
		Pizza hawaiian = new Pizza("Hawaiian Pizza", 10.99, true, true);
		Pizza pepperoni = new Pizza("Pepperoni", 9.99, true, true);
		menuItems.add(margherita);
		menuItems.add(hawaiian);
		menuItems.add(pepperoni);

		// Bevande
		Drink coke = new Drink("Coca-Cola", 2.49, "Nutritional info for Coke");
		Drink sprite = new Drink("Sprite", 2.49, "Nutritional info for Sprite");
		menuItems.add(coke);
		menuItems.add(sprite);

		// Oggettistica
		Merchandise tshirt = new Merchandise("Godfather's Pizza T-Shirt", 19.99);
		Merchandise cap = new Merchandise("Godfather's Pizza Cap", 14.99);
		menuItems.add(tshirt);
		menuItems.add(cap);

		return menuItems;
	}
}
