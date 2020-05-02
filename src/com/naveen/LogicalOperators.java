package com.naveen;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint a=10;

		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a < c);// false && true = false
		System.out.println(a < b & a < c);// false & true = false

		System.out.println(a < b && a++ < c);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 because second condition is checked

		a = 10;
		b = 5;
		c = 20;

		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true
		// || vs |
		System.out.println(a > b || a++ < c);// true || true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a > b | a++ < c);// true | true = true
		System.out.println(a);// 11 because second condition is checked

		a = 2;
		b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);

		a = 10;
		b = 5;
		min = (a < b) ? a : b;
		System.out.println(min);

		a = 10;
		b = 20;
		a += 4;// a=a+4 (a=10+4)
		b -= 4;// b=b-4 (b=20-4)
		System.out.println(a);
		System.out.println(b);

		a = 10;
		a += 3;// 10+3
		System.out.println(a);
		a -= 4;// 13-4
		System.out.println(a);
		a *= 2;// 9*2
		System.out.println(a);
		a /= 2;// 18/2
		System.out.println(a);

	}

}
