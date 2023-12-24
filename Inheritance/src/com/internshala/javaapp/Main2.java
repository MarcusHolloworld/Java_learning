package com.internshala.javaapp;

public class Main2 {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		//dog1.breed = "Labradar";
		//dog1.size = 43;
		//dog1.color = "Brown";

		dog1.setBreed("Labradar");
		dog1.setSize(43);
		dog1.setColor("Black");

		System.out.println(dog1.getBreed());
		System.out.println(dog1.getSize());
		System.out.println(dog1.getColor());

		dog1.bark();
		dog1.run();
	}
}
