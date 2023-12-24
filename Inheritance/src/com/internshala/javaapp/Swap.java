package com.internshala.javaapp;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a=");
		int a = scanner.nextInt();
		System.out.print("b=");
		int b = scanner.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a="+a+" , b="+b);
	}
}
