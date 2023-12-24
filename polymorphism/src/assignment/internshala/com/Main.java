package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Animal animal1 = new Animal();
	    animal1.run();

	    Animal animal2 = new Dog();  // This is UPCUSTING
	    animal2.run();
    }
}

class Animal {

	public void run() {
		System.out.println("Animal is running.");
	}
}

class Dog extends Animal {

	String name;

	public void run() {
		System.out.println("Dog is running.");
	}
}
