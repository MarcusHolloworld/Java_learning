package assignment.internshala.com;

import java.lang.annotation.Inherited;

public class Exercise4 {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.cats();
		animal.dogs();
		System.out.println("-----------");
		Animal animal2 = new Dog();
		animal2.dogs();
		animal2.cats();
	}
}

abstract class Animal {
	abstract public void cats();

	abstract public void dogs();
}

class Cat extends Animal {
	@Override
	public void cats() {
		System.out.println("cats meow");
	}
	@Override
	public void dogs(){

	}
}

class Dog extends Animal {
	@Override
	public void dogs(){
		System.out.println("Dogs bark!");
	}
	@Override
	public void cats(){

	}
}


