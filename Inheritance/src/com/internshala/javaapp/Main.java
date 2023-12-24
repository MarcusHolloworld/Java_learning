package com.internshala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // String name;
        // int population;
        // float populationDensity;
        // double GDP;
        // char currency;
        // boolean isSeculer;

        //Scanner Scanner = new Scanner(System.in);

	    // System.out.print("Enter your country name:");
        // name = Scanner.nextLine();

	    // System.out.print("Enter population:");
	    // population = Scanner.nextInt();

	    // System.out.print("Enter currency symbol:");
	    // currency = Scanner.next().charAt(0);

        // System.out.println("Your country name is "+name);
	    // System.out.println("Your country population is "+population);
	    // System.out.println("Your country currency symbol is "+ currency);
	    // Scanner.close();

        // India has population of 132657000 and population density is 393.0 person per sq km
	    // System.out.println(name + " has population of " + population + " and population density is " + populationDensity + " persion per sq km");
	    // System.out.println(name + " has GDP of " + GDP + " trillion dollar and it's currency symbol is " + currency);

	    // Implicit conversion
	    // int radious = 400;
	    // double newRadious = radious;
	    // System.out.println(newRadious);

	    // Explicit conversion
	    // long diameter = 7878787878L;
	    // int newDiameter = (int) diameter;
	    // System.out.println(newDiameter);

	    // Arithmetic Operator
	    // float result = 9.0f / 2;
	    // System.out.println(result);

	    // int result1 = 3+1-7*5%3/2;
	    // System.out.println(result1);

	    // Assignment operator

	    // int income = 15000;
	    // int bonus = 2000;
	    // income += bonus;
	    // System.out.println(income);  // income = income + bonus

	    // Example 2
	    // int num = 10;
	    // int x = 2;
	    //num *= x;
	    //num /= x;
	    //num %= x;
	    //System.out.println(num);  // num = num * x , num = num / x , num = num % x

	    // Increment operator
	    //int year = 10;
	    //int newYear = year--;
	    //System.out.println(year);
	    //System.out.println(newYear);

	    // Logical operator

	    //System.out.println(true);
	    //System.out.println(!true);
	    //System.out.println(true && true);
	    //System.out.println(true && false);
	    //System.out.println(false && false);
	    //System.out.println(true || true);
	    //System.out.println(true || false);
	    //System.out.println(false || false);

	    //boolean x = 5>2;
	    //boolean y = 5>100;
	    //System.out.println(!(x && y));

	    // If-ELSE IF
	    /*int num = 73;
	    char grade;

	    if (num >= 90) {
	    	grade = 'A';
	    } else if (num >= 80) {
	    	grade = 'B';
	    } else if (num >= 70) {
	    	grade = 'C';
	    } else if (num >= 60) {
	    	grade = 'D';
	    } else {
	    	grade = 'F';
	    }
	    System.out.println("grade: " + grade);

	    // switch

	    switch (grade) {
		    case 'A':
			    System.out.println("Excellent Score.");
			    break;
		    case 'B':
			    System.out.println("Very good Score.");
			    break;
		    case 'C':
			    System.out.println("Good score but You can do better.");
			    break;
		    case 'D':
			    System.out.println("Average score. Work hard.");
			    break;
		    case 'F':
			    System.out.println("You are failed");
			    break;
			default:
				System.out.println("Invalid grade");
	    } */

	    // for loop

	    /*for (int num = 1 ; num <=100 ; num++) {
	    	if (num % 2 != 0) {
			    System.out.println(num);
		    }
	    }*/

	    // while loop

	    /* int i = 0;
	    while (i <= 10) {
		    System.out.println(i);
		    i++;
	    }*/

	    // Factorial of a number

	    /*int num = 10;
	    long factorial = 1;
	    while (num > 0) {
	    	factorial *= num;
	    	num--;
	    }
	    System.out.println(factorial);*/

	    // do-while group

	    /*int count = 0;
	    do {
		    System.out.println(count);
		    count++;
	    } while (count <= 10);

	    // Add number until user enter 0;

	    double a = 0;
	    double sum = 0;
	    do {
		    System.out.println(":Enter a number:");
		    a = Scanner.nextDouble();
		    sum += a;
	    } while (a != 0);
	    System.out.println(sum);*/
    }
}
