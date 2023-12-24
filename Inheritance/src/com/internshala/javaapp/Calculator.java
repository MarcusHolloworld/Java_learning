package com.internshala.javaapp;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter second number");
		int b = scanner.nextInt();

		System.out.println("----------Enter a number according to your operation----------");
		System.out.println("press 1 for Addition.");
		System.out.println("press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("press 4 for Division");
		System.out.println("press 5 for Remainder");

		int ope = scanner.nextInt();

		switch (ope) {
			case 1:
				add(a,b);
				break;
			case 2:
				sub(a,b);
				break;
			case 3:
				multi(a,b);
				break;
			case 4:
				divi(a,b);
				break;
			case 5:
				remd(a,b);
				break;
			default:
				System.out.println("Please select number between 1 to 5:");
		}
	}

	public static void add(int x , int y) {
		System.out.println("Addition of this two number is: " + (x + y));
	}

	public static void sub(int x , int y) {
		System.out.println("Subtraction of this two number is: " + (x - y));
	}

	public static void multi(int x , int y) {
		System.out.println("Multiplication of this two number is: " +(x * y));
	}

	public static void divi(int x , int y) {
		System.out.println("Divition of this two number is: " + (x / y));
	}

	public static void remd(int x , int y) {
		System.out.println("Remainder of this two number is: " + (x % y));
	}
}
