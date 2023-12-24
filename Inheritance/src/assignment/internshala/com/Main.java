package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Puppy puppy = new Puppy();
	    puppy.name = "Labradar";
	    puppy.color = "Brown";
	    puppy.age = 2;
	    puppy.size = 3;
	    System.out.println(puppy.name);
	    System.out.println(puppy.color);
	    System.out.println(puppy.size);
	    System.out.println(puppy.age);
	    puppy.run();
	    puppy.bark();
    }
}

class Animal {
	String name;

	public void run() {
		System.out.println("Animal is running.");
	}
}

class Dog extends Animal {

	String color;

	public void bark() {
		System.out.println("wooh ! wooh !");
	}
}

class Puppy extends Dog {
	int size;
	int age;
}

class Cat extends Animal {

	String pattern;

	public void meow() {
		System.out.println("Meow ! Meow !");
	}
}