package assignment2;

public class Program3 {
	
	public void checkIfGivenIsPrimeNo(int n) {
		boolean flag=true;
		int m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = false;
					break;
				}
			}
			
			if (flag == true) {
				System.out.println(n + " is prime number");
			}
		}
	}
	
	public static void main(String args[]) {
		Program3 prg3 = new Program3();
		prg3.checkIfGivenIsPrimeNo(13);		
	}

}
