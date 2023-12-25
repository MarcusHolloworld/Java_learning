package assignment.internshala.com;

public class Pastry extends Cake {
	@Override
	public void display() {
		System.out.println(getName() + " : ₹ " + getPrice() + " per price");
	}
}
