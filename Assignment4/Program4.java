package assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		System.out.println("Enter number of elements required in Hash map");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter <Integer> and <String> values");
			int integer = sc.nextInt();
			String str = sc.next();
			map.put(integer, str);
		}
		sc.close();
		ArrayList<Integer> keyList = new ArrayList<Integer>(map.keySet());
		ArrayList<String> valueList = new ArrayList<String>(map.values());

		System.out.println("Hash Map key list -->" + keyList);
		System.out.println("Hash Map value list -->" + valueList);
	}

}
