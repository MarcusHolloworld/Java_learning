package com.internshala.javaapp;

import java.util.Scanner;

public class SwapName {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String x = scanner.nextLine();
		System.out.print("Enter friend name: ");
		String y = scanner.nextLine();
		String z = x;
		x = y;
		y = z;
		System.out.println("Your name is: " + x);
		System.out.println("Your friend name is: " + y);
	}
}
