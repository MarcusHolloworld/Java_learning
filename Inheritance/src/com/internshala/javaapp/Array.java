package com.internshala.javaapp;

public class Array {
	public static void main(String[] args) {
		int[] myFirstArray = {20,19,6,12};
		//myFirstArray[2] = 48;
		//System.out.println(myFirstArray[1]);
		//System.out.println(myFirstArray.length);

		/*for (int i = 0 ; i < myFirstArray.length ; i++) {
			System.out.println(myFirstArray[i]);
		}*/

		/*float[] mySecondArray = new float[3];
		mySecondArray[0] = 34.6f;
		mySecondArray[1] = 5.8f;
		mySecondArray[2] = 43.2f;

		float sum = 0;

		for (int i = 0 ; i < mySecondArray.length ; i++) {
			sum += mySecondArray[i];
			System.out.println(mySecondArray[i]);
		}

		for (float num : mySecondArray) {
			System.out.println(num);
		}

		System.out.println(sum);*/

		/*double[] myArray = new double[3];
		myArray[0] = 7.6;
		myArray[1] = 5.5;
		myArray[2] = 4.46;

		double sum = 0;

		for (double num : myArray) {
			sum += num;
			System.out.println(num);
		}
		System.out.print("Sum of all elements are: " + sum);*/

		/*int[] firstArray = {3,5,1,9};
		int[] secondArray = {10,15,3,0};
		int[] thirdArray = {1,11,31,90};
		int[] forthArray = {2,51,1,9};

		int[][] myFirst2DArray = {firstArray, secondArray, thirdArray, forthArray};
		//System.out.println(myFirst2DArray[1][1]);

		for (int row = 0 ; row < myFirst2DArray.length ; row++) {
			for (int col = 0; col < 4 ; col++) {
				System.out.print(myFirst2DArray[row][col]+" ");
			}
			System.out.println();
		}*/

		char[] myArray = {'w','e','l','c','o','m','e'};
		String firstString = "welcome";
		System.out.println(myArray.length);
		System.out.println(firstString.length());
		//System.out.println(myFirstArray);
		System.out.println(firstString.charAt(2));

		System.out.println(firstString.toUpperCase());
		System.out.println(firstString.toLowerCase());
		System.out.println(firstString.contains("come"));
	}
}
