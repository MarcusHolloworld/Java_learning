package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Dog dog = new Dog();
	    dog.run();
	    dog.eat();
    }
}

abstract class Animal {
	public void run() {
		System.out.println("Animal is running.");
	}

	abstract void eat();
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}
}
