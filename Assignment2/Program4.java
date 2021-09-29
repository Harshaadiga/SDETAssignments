package assignment2;

import java.util.Scanner;

public class Program4 {
	
	public int sumOfDigits(int n) {
		int sum = 0, digit = 0;
		
		if (n > 0) {
			while (n > 0) {
				// finds the last digit of the given number
				digit = n % 10;
				// adds last digit to the variable sum
				sum = sum + digit;
				// removes the last digit from the number
				n = n / 10;
			}
		} else {
			sum = -1;
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		sc.close();
		
		Program4 prg4 = new Program4();
		int sum = prg4.sumOfDigits(number);
		
		if (sum == -1) {
			System.out.println("Value provided is less than or equal to 0. Provide vaue grater than 0");
		}else {
			System.out.println("Sum of Digits: " + sum);
		}
	}

}
