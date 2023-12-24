package com.internshala.javaapp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalWatch {
	public static void main(String[] args) {
		// Create a DateTimeFormatter for formatting the date and time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		// Get the current date and time
		LocalDateTime now = LocalDateTime.now();

		// Format and display the current date and time
		String formattedDateTime = now.format(formatter);
		System.out.println(formattedDateTime);
	}
}
