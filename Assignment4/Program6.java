package assignment4;

import java.util.Scanner;
import java.util.TreeSet;

public class Program6 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of elements required in Hash set");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter <Integer> value");
			int integer = sc.nextInt();
			treeSet.add(integer);
		}
		sc.close();

		System.out.println("Lowest value Stored in Java TreeSet is : " + treeSet.first());
		System.out.println("Highest value Stored in Java TreeSet is : " + treeSet.last());

	}

}
