package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManger {
	Scanner sc = new Scanner(System.in);
	final int MAX_STUDENT = 3;

	Coffee[] arr = new Coffee[MAX_STUDENT];

	public void insertCoffee() {
		for (int i = 0; i < arr.length; i++) {
			Coffee c = new Coffee();
			System.out.print("원산지 : ");
			c.setOrigin(sc.next());
			System.out.print("지역 : ");
			c.setLocation(sc.next());
			arr[i] = c;
		}
	}

	public void printCoffee() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}
	}

}
