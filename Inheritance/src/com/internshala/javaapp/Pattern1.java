package com.internshala.javaapp;

public class Pattern1 {

	public static void main(String[] args) {
		//solid rectangle
		System.out.println("This is solid rectangle pattern!");
		System.out.println("--------------------------------");
		for (int row = 0 ; row <4 ; row++) {
			for (int col = 0 ; col < 5 ; col++) {
				System.out.print('*');
			}
			System.out.println();
		}


		System.out.println("This is hollow rectangle");
		System.out.println("-------------------------");
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 5) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
