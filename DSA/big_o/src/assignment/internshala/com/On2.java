package assignment.internshala.com;

public class On2 {
	public static void main(String[] args) {
		printItem(10);
	}

	public static void printItem(int n) {
		for (int i = 0 ; i < n ; i++) {      //this nested for loop takes O(n^2) time complexity.
			for (int j = 0 ; j < n ; j++) {
				System.out.println(i + " " +j);
			}
		}

		for (int k = 0 ; k < n ; k++) {    // this for loop takes O(n) time complexity.
			System.out.println(k);
		}
	}
}

// So total time complexity is O(n^2) + O(n) which is O(n^2 + n), here n is non-dominants so drop it.
// This is second rule of simplification
