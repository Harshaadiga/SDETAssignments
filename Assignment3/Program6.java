package assignment3;

public class Program6 {
	public static void main(String[] args) {
		try {
			System.out.println("You are not dividing a number by 0: -- "+ (4 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: cannot divide by 0");
			throw new ArithmeticException();
		}
	}

}
