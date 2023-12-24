package assignment.internshala.com;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {

		Student student1 = new Student("Rohit" , 34 , 87);
		Student student2 = new Student("Dishani", 23 , 50);
		Student student3 = new Student("Sahina",67 , 60);
		Student student4 = new Student("Rakesh", 56, 70);
		Student student5 = new Student("Sovon", 12 , 95);

		List<Student> student = new ArrayList();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student3);
		student.add(student5);

		for (Student std : student) {
			System.out.println(std.getName() + "--" + std.getRoll_no() + "--" + std.getMarks());
		}


	}
}

class Student {
	private String name ;
	private int roll_no ;
	private int marks ;

	public Student(String name, int roll_no , int marks) {
		this.name = name;
		this.roll_no =roll_no;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no1) {
		this.roll_no = roll_no1;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
