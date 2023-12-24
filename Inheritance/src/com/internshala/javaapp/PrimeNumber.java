package com.internshala.javaapp;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		// Write your code here
		Scanner scanner = new Scanner(System.in);

		// Using For Loop

		int flag = 0;
		int a = scanner.nextInt();
		if (a == 0) {
			System.out.println(a + " not a prime number");
		} else {
			for (int i = 2 ; i < a ; i++) {
				if (a%i ==0) {
					System.out.println(a + " not a prime number");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println(a + " is a prime number");
		}
	}
}
