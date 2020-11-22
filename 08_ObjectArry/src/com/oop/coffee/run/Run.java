package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManger;

public class Run {

	public static void main(String[] args) {
		CoffeeManger cf = new CoffeeManger();
		cf.insertCoffee();
		cf.printCoffee();
	}
}
