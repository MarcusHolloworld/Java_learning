package assignment.internshala.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

	    List<String> namesList = new ArrayList();

	    namesList.add("Sam");
	    namesList.add("Rahul");
	    namesList.add("Mohit");
	    namesList.add("Tony");

	    namesList.remove(1);
	    namesList.add(1,"Petter");
	    namesList.set(1,"Rahul");
	    namesList.remove("Mohit");

	    //System.out.println(namesList.get(2));
	    //System.out.println(namesList.size());

	    // For each

	    for (String name : namesList) {
		    System.out.println(name);
	    }

	    // Normal for loop

	    /*for (int i = 0; i < namesList.size() ; i++) {
		    System.out.println(namesList.get(i));
	    }*/

	    Employee e1 = new Employee("Albert");
	    Employee e2 = new Employee("Parul");
	    Employee e3 = new Employee("Kamal");

	    List<Employee> employeeList = new ArrayList();
	    employeeList.add(e1);
	    employeeList.add(e2);
	    employeeList.add(e3);

	    for (Employee employee : employeeList) {
		    System.out.println(employee.name);
	    }
    }
}

class Employee {
	String name;

	public Employee(String name) {
		this.name = name;
	}
}
