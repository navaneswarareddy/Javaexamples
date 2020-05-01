package com.naveen;

class Parent {
	void show() {
		System.out.println("parent class");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("child class");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		c.display();
	}
}