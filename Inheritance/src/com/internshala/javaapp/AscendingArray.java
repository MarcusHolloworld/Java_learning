package com.internshala.javaapp;
import java.util.Scanner;

public class AscendingArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of element in array: ");
		int x = scanner.nextInt();
		int[] array = new int[x];

		for (int i = 0 ; i < x ; i++) {
			array[i] = scanner.nextInt();
		}

		ascendingArray(array);
	}

	public static void ascendingArray(int[] arr) {
		int[] newArray = new int[arr.length];
		int j = 0;

		for (int i = arr.length - 1 ; i >= 0; i--) {
			newArray[j] = arr[i];
			j++;
		}

		for (int k = 0; k < newArray.length ; k++) {
			System.out.print(newArray[k]);
			System.out.print(" ");
		}
	}
}
