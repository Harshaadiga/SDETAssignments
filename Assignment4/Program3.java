package assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		System.out.println("Enter number of elements required in Hash map");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter <Integer> and <String> values");
			int integer = sc.nextInt();
			String str = sc.next();
			map.put(integer,str);
		}
		
		System.out.println("Enter a key to be searched.\nValid values to provide: "+map.keySet());
		int key = sc.nextInt();
		sc.close();
		
		System.out.println("Hash map content: " + map);

		// Check is key exists in the Map
		boolean isKeyPresent = map.containsKey(key);
		System.out.println("Does key " + key + " exists: " + isKeyPresent);
	}

}
