package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cookie cookieOne = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Blue");
        cookieOne.setColor("Red");
	    System.out.println(cookieOne.getColor());
	    System.out.println(cookieTwo.getColor());
    }
}
