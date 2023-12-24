package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee();
        e1.name = "Rohit";

	    System.out.println(Employee.company);

	    Employee.count = 20;

	    System.out.println(Employee.count);

	    Employee.myFirstStsticMethod();
    }
}

class Employee {

    public String name;

    public static final String company = "Internshala";

    public static int count = 0;

    public static void myFirstStsticMethod() {

	    System.out.println("This is my first static method.");

	    System.out.println(count);
	    System.out.println(company);
	    test();
    }

    public static void  test() {
    	// My code
    }
}
