package com.naveen;

public class Constructor {
	public String brand = null;
	public String model = null;
	public String color = null;

	public Constructor(String theBrand, String theModel, String theColor) {
		this.brand = theBrand;
		this.model = theModel;
		this.color = theColor;
		System.out.println(this.brand + this.model + this.color);
	}

	public Constructor() {
		System.out.println(this.brand + this.model + this.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor con = new Constructor("a", "b", "c");
	}

}
