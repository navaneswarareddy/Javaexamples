package com.naveen;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]); // Access the Elements of an Array

		cars[0] = "Opel";
		System.out.println(cars[0]); // Now outputs Opel instead of Volvo

		System.out.println(cars.length); // Array Length

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]); // for loop
		}

		for (String i : cars) {
			System.out.println(i); // for each loop
		}
	}

}
