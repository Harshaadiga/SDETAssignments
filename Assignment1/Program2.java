package assignment1;

public class Program2 {
	
	public void fiboseries(int n) {
		int a=0;
		int b=1;
		int c;
		for (int i = 0; i < n; i++) {
			if (i==0) {
				System.out.println(a);
			} else if (i==1) {
				System.out.println(b);
			} else {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 fibonacciseries = new Program2();
		fibonacciseries.fiboseries(10);
	}

}
