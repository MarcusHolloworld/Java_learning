package assignment.internshala.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Perimeter area = new Area();
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("This programme simple calculate area and perimeter of those shape..");

	    System.out.println("press 1 fot Rectangle.");
	    System.out.println("press 2 for Square.");
	    System.out.println("press 3 for Circle.");

	    System.out.println("Choose your option: ");
	    int n = scanner.nextInt();

	    switch (n) {
		    case 1:
			    System.out.println("Enter length of the rectangle:");
			    double length = scanner.nextDouble();
			    System.out.println("Enter breadth of the rectangle: ");
			    double breadth = scanner.nextDouble();
			    area.rectangle(length,breadth);
			    area.perimeterOfRectangle(length,breadth);
			    break;
		    case 2:
			    System.out.println("Enter the length of the Square: ");
			    double lengthOfSquare = scanner.nextDouble();
			    area.square(lengthOfSquare);
			    area.PerimeterOfSquare(lengthOfSquare);
			    break;
		    case 3:
			    System.out.println("Enter the radius of the circle: ");
			    double radius = scanner.nextDouble();
			    area.circle(radius);
			    area.perimeterOfCircle(radius);
			    break;
			default:
				System.out.println("your choice od Invalid. Please choose a valid option.");
				break;
	    }

    }
}

interface Perimeter {
	void rectangle(double length, double breadth);

	void square(double length);

	void circle(double radius);

	void perimeterOfRectangle(double length , double breadth);

	void PerimeterOfSquare(double length);

	void perimeterOfCircle(double radius);
}

class Area implements Perimeter {
	private static final double PI = 3.14;
	@Override
	public void rectangle(double length , double breadth) {
		double area = (length * breadth);
		System.out.println("Area of the rectangle is " + area);
	}
	@Override
	public void square(double length) {
		double area = length * length;
		System.out.println("Area od the square is " + area);
	}
	@Override
	public void circle(double radius) {
		double area = PI * radius * radius;
		System.out.println("Area of the circle is : " + area);
	}
	@Override
	public void perimeterOfRectangle(double length , double breadth) {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter if the rectangle is " + perimeter);
	}
	@Override
	public void PerimeterOfSquare(double length) {
		double perimeter = 4 * length;
		System.out.println("Perimeter of square is " + perimeter);
	}
	@Override
	public void perimeterOfCircle(double radius) {
		double perimeter = 2 * PI * radius;
		System.out.println("Perimeter of the circle is " + perimeter);
	}
}
