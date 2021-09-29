package assignment2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("How many numbers you want to enter?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		double[] arr = new double[n];
		double tot = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
		}

		for (int i = 0; i < arr.length; i++) {
			tot = tot + arr[i];
		}
		double average = tot / arr.length;
		System.out.format("The average is: " + average);

		scanner.close();
	}
}
