package com.internshala.javaapp;

public class Rectangle {
	private double length;
	private double breadth;

	public void calculateArea() {
		double area = length * breadth;
		System.out.println("Area of this rectangle is :" + area);
	}
	public void calculatePerimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of this rectangle is: " + perimeter);
	}

	// Getter and setter

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}
