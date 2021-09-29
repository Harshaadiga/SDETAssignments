package assignment2;

public class Program5 {
	public static void main(String[] args) {
		int number = 123;
		int reverse = 0;
		
		while (number != 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
