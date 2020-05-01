package com.naveen;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		double y = x;
		System.out.println(x); // int value
		System.out.println(y); // convert int to double

		double a = 10.7;
		int b = (int) a; // To convert double to integer
		System.out.println(b);

		int d = 67;
		char e = (char) d; // To convert integer to char
		System.out.println(d);
		System.out.println(e);
	}

}
