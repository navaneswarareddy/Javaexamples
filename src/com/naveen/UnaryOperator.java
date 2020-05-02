package com.naveen;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;

		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

		int c = 10;
		int d = -10;
		boolean e = true;
		boolean f = false;
		System.out.println(~c);// -11 (minus of total positive value which starts from 0)
		System.out.println(~d);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!e);// false (opposite of boolean value)
		System.out.println(!f);// true
	}

}
