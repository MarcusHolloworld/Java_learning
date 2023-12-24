package com.internshala.javaapp;
import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a 3 digit number: ");
		int num = scanner.nextInt();

		if (num > 99 && num < 1000) {
			reverseInt(num);
		} else {
			System.out.println("Please enter a 3 digit number");
		}
	}

	public static void reverseInt(int num) {
		//code
		int firstDigit = num / 100;
		int secondDigit = (num % 100) / 10;
		int thirdDigit = num % 10;

		System.out.println((thirdDigit * 100) + (secondDigit * 10) + firstDigit);
	}
}
