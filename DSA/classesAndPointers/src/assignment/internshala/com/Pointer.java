package assignment.internshala.com;

import java.util.HashMap;
import java.util.Map;

public class Pointer {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = num1;

		num1 = 22;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		HashMap<String , Integer> map1 = new HashMap<>();
		HashMap<String , Integer> map2 = new HashMap<>();
		map1.put("Rohit", 78);
		map2 = map1;

		map1.put("Rohit" , 24);

		System.out.println(map1);
		System.out.println(map2);
	}
}
