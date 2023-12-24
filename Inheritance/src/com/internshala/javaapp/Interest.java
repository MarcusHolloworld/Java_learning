package com.internshala.javaapp;

public class Interest {
	public static void main(String[] args) {
		// for user 1

		double si1 = calculateSimpleInterest(10000,8.7f,2);
		System.out.println(si1);

		// for user 2

		double si2 = calculateSimpleInterest(130000,10.5f,4);
		System.out.println(si2);

		// For user 3

		double si3 = calculateSimpleInterest(40000,3.4f,7);
		System.out.println(si3);
	}

	public static double calculateSimpleInterest(int principal , float rateOfInterest , int timePeriod) {
		double si = principal * rateOfInterest * timePeriod / 100;
		return si;
	}
}
