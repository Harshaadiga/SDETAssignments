package assignment1;

public class Program1 {
	public void fact(int n) {
		int finalfactorial=1;
		if (n >= 1) {
			for (int i = n; i >= 1; i--) {
				finalfactorial*=i;
			}
			System.out.println("Factorial of a number: "+finalfactorial);
		} else {
			System.out.println("Please provide a value greater than or equal to 1");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 factorial = new Program1();
		factorial.fact(5);
		factorial.fact(0);
	}

}
