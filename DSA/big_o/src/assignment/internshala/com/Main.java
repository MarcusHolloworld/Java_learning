package assignment.internshala.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    printItems(10);
    }

    public static void printItems(int x) {
    	for (int i = 0 ; i <= x ; i++) {     //This for loop takes O(n) time complexity.
		    System.out.println(i);
	    }
    }
}

// If there is a another for loop just after this for loop.
// For this case time complexity will be O(n) +O(n) which is O(n + n) = O(2n).
// For this case we will drop constant from O(2n) and after drop constant it will be O(n).
// This is 1st rule of simplification.
