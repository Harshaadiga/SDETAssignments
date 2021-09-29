package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program7 {

	public ArrayList<String> sortArrayList(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (arrayList.get(i).compareToIgnoreCase(arrayList.get(j)) > 0) {
					String tmp = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, tmp);
				}
			}
		}
		return arrayList;
	}

	public static void main(String args[]) {
		ArrayList<String> arrayList = new ArrayList<String>();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements required in Hash set");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println("Enter <String> value");
				String str = sc.next();
				arrayList.add(str);
			}
			sc.close();
			
			/* Unsorted List */
			System.out.println("\nBefore Sorting:");
			for (String lst : arrayList) {
				System.out.println(lst);
			}
			
			Program7 prg7 = new Program7();
			ArrayList<String> sortedArrayList = prg7.sortArrayList(arrayList);

			/* Sorted List */
			System.out.println("\nAfter Sorting:");
			for (String lst : sortedArrayList) {
				System.out.println(lst);
			}
		} catch(NumberFormatException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
