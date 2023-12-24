package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    Animal animal1 = new Dog();
	    animal1.run();
	    animal1.eat();
    }
}

interface Animal {

    abstract public void run();

    abstract public void eat();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
	public void run() {
	    System.out.println("Dog is running.");
    }
}

