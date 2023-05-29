package com.example.godfatherspizza.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuPrinter implements CommandLineRunner {

	@Autowired
	private List<MenuItem> menuItems;

	public static void main(String[] args) {
		SpringApplication.run(MenuPrinter.class, args);
	}

	@Override
	public void run(String... args) {
		printMenu(menuItems);
	}

	private void printMenu(List<MenuItem> menuItems) {
		for (MenuItem menuItem : menuItems) {
			System.out.println("Name: " + menuItem.getName());
			System.out.println("Price: $" + menuItem.getPrice());

			if (menuItem instanceof Pizza) {
				Pizza pizza = (Pizza) menuItem;
				System.out.println("Has Toppings: " + pizza.isHasToppings());
				System.out.println("Has Larger Size: " + pizza.isHasLargerSize());
				System.out.println();
			} else if (menuItem instanceof Drink) {
				Drink drink = (Drink) menuItem;
				System.out.println("Nutritional Info: " + drink.getNutritionalInfo());
				System.out.println();
			} else {
				System.out.println();
			}
		}
	}
}
