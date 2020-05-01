package com.naveen;

public class This {
	int x = 10; // instance variable

	void display() {
		int x = 20; // local variable
		System.out.println(this.x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This c = new This();
		c.display();
	}
}
