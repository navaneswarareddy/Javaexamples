package com.naveen;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, result;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter First number:");
		num1 = scan.nextInt();

		System.out.print("Enter Second number:");
		num2 = scan.nextInt();

		result = num1 + num2;

		System.out.println("Adition of " + num1 + " " + "and" + " " + num2 + " " + "is: " + result);

		scan.close();
	}

}
