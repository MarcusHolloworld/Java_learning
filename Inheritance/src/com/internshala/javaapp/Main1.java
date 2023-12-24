package com.internshala.javaapp;

public class Main1 {
	public static void main(String[] args) {
		// Rectangle 1
		Rectangle r1 = new Rectangle();
		//r1.length = 7.87;
		//r1.breadth = 6.34;

		r1.setLength(7.87);
		r1.setBreadth(6.34);

		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());

		r1.calculateArea();
		r1.calculatePerimeter();
	}
}
