package assignment1;

public class Program5 {
	
	private void printPrimeNumberInRange(int range) {
		System.out.println("First "+range+" prime numbers");
	
		int cnt = 0;
		for(int i=1;i<=100;i++) {
			int counter=0;
			for(int j=i;j>=1;j--) {
				if (i%j==0) {
					counter+=1;
				}
			}
			
			if(counter==2) {
				System.out.println(i);
				cnt+=1;
			}
			if(cnt==range) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program5 primenumber = new Program5();
		primenumber.printPrimeNumberInRange(10);
	}

}
