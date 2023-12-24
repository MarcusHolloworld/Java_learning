package com.internshala.javaapp;

public class Exception {
	public static void main(String[] args) {

		System.out.println("Program starts:");

		/*int[] myArray = {3,45,8,10};
		try {
			int result = myArray[1] / 0;
			System.out.println(myArray[23]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
			System.out.println(exception);
		} finally {
			System.out.println("The finally block is always executed");
		}
		try {
			String s = null;
			System.out.println(s.length());
		} catch (java.lang.Exception ex){
			System.out.println(ex);
		}*/

		try{
			String str = null;
			String s = str.concat("Hello");
			System.out.println(s);
		} catch (java.lang.Exception ex) {
			System.out.println(ex);
		}

		System.out.println("Program ends");
	}
}
