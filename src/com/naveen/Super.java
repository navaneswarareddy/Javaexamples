package com.naveen;

class Old {
	void M1() {
		System.out.println("parent class");
	}
}

class New extends Old {
	void M1() {
		super.M1();
		System.out.println("child class");
	}
}

public class Super {
	public static void main(String[] args) {
		New c = new New();
		c.M1();
	}
}