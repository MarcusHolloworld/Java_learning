package assignment.internshala.com;

public class Interface {
	public static void main(String[] args) {

		Remote remote1 = new Television();
		remote1.powerOn();
		remote1.volumnUp();
		remote1.volumnDown();
		remote1.poewrOff();
	}
}

interface Remote {

	void volumnUp();

	void volumnDown();

	void powerOn();

	void poewrOff();

}

class Television implements Remote{

	@Override
	public void volumnUp() {
		System.out.println("Volumn Up!");
	}

	@Override
	public void volumnDown() {
		System.out.println("Volumn Dowm!");
	}

	@Override
	public void powerOn() {
		System.out.println("Power On!");
	}

	@Override
	public void poewrOff() {
		System.out.println("Power off!");
	}
}
