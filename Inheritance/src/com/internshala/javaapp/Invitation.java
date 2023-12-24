package com.internshala.javaapp;
import java.util.Scanner;
public class Invitation {
	public static  void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Enter your friend's name:");
		name = scanner.nextLine();
		System.out.println("Hey " + name + ", it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!");
	}
}
