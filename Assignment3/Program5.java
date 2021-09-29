package assignment3;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a string: ");
		String str = sc.next();
		sc.close();
		
		try {
			int age = Integer.parseInt(str);
			System.out.println("Your age is : " + age);
		} catch (NumberFormatException numberexception) {
			System.out.println("Incorrect input provided. Expecting integer input.");
			throw new NumberFormatException();
		}
	}
}
