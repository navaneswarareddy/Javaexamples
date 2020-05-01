/*
	boolean 1 bit
	char	2 byte  -32,768 to 32,767
	byte    1 byte  -128 to 127
	short   2 bytes  -32,768 to 32,767
	integer 4 bytes -2,147,483,648 to 2,147,483,647
	long    8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80
	float   4 bytes 7 decimal digits
	double  8 bytes 16 decimal digits
*/

package com.naveen;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte myByteNum = 100; // byte number
		short myShortNum = 5000; // short number
		int myIntNum = 5; // Integer (whole number)
		long myLongNum = 15000000000L; // Long number
		float myFloatNum = 5.99f; // Floating point number
		double myDoubleNum = 19.99d; // Double number
		char myLetter = 'D'; // Character
		boolean myBool = true; // Boolean
		String myText = "Hello"; // String

		System.out.println(myByteNum);
		System.out.println(myShortNum);
		System.out.println(myIntNum);
		System.out.println(myLongNum);
		System.out.println(myFloatNum);
		System.out.println(myDoubleNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);

	}

}
