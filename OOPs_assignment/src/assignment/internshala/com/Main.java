package assignment.internshala.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

	    List<Cake> cake = new ArrayList();

	    Cake cake1 = new Cake();
	    cake1.setName("Chocolate Brownie");
	    cake1.setPrice(250.0f);

	    Cake cake2 = new Cake();
	    cake2.setName("Chocolate Maple");
	    cake2.setPrice(300.0f);

	    cake.add(cake1);
	    cake.add(cake2);

	    List<Pastry> pastry = new ArrayList();

	    Pastry pastry1 = new Pastry();
	    pastry1.setName("Black Forest");
	    pastry1.setPrice(35.0f);

	    Pastry pastry2 = new Pastry();
	    pastry2.setName("Choco Truffle");
	    pastry2.setPrice(40.0f);

	    pastry.add(pastry1);
	    pastry.add(pastry2);

	    System.out.println("       Today's Special Menu        ");
	    System.out.println("-----------------------------------");
	    System.out.println("Special Cakes");
	    System.out.println("-----------------------------------");

	    for (Cake name : cake) {
	    	name.display();
	    }
	    System.out.println();

	    System.out.println("Special Pastry");
	    System.out.println("-----------------------------------");

	    for (Pastry name : pastry) {
	    	name.display();
	    }

    }
}
