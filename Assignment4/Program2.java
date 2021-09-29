package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);					
		ArrayList<String> arrayList = new ArrayList<String>();
		System.out.println("Enter number of element in Array list");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			arrayList.add(str);
		}
		sc.close();

		System.out.println("Before Reverse ArrayList:");
		System.out.println(arrayList);

		/*
		 * Reversing the list using Collections.reverse() method
		 */
		Collections.reverse(arrayList);

		System.out.println("After Reverse ArrayList:");
		System.out.println(arrayList);
	}

}
