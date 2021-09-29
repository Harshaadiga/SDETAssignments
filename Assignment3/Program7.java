package assignment3;

public class Program7 {
	public static void main(String args[]) throws Exception {
		try {
			try {
				System.out.println("Divide by 0"+(2 / 0));
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];

				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				throw new ArrayIndexOutOfBoundsException("Array out of bound");
			}
		} catch (Exception e) {
			System.out.println("handled the exception (outer catch)");
		}

		System.out.println("normal flow..");
	}

}
