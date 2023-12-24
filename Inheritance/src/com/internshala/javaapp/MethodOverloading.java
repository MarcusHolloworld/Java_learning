package com.internshala.javaapp;

public class MethodOverloading {
	public static void main(String args[]) {
		add();
		add(32,45);
		add(3.76f,12.31f);
	}
	public static void add() {
		int sum = 5 + 9;
		System.out.println(sum);
	}
	public static void add(int a , int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	public static void add(float a , float b) {
		float sum = a + b;
		System.out.println(sum);
	}
}
