package com.internshala.javaapp;

public class Dog {

	private String breed;
	private int size;
	private String color;

	public void bark() {
		System.out.println(" wooh ! wooh !");
	}
	public void run() {
		System.out.println("My breed is " + breed + ". I am running.");
	}

	// Getter and Setter Method
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
