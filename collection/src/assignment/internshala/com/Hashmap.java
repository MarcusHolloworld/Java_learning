package assignment.internshala.com;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {

		Map<Integer , String> namesMap = new HashMap();
		namesMap.put(1,"Shasank");
		namesMap.put(43,"Rahul");
		namesMap.put(13,"Robert");

		System.out.println(namesMap.get(43));

		for (Map.Entry entry : namesMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
