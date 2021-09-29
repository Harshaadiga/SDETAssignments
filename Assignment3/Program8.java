package assignment3;

public class Program8 {

	public void reThrowingException() {
		try {
			int a[] = new int[5];

			a[5] = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Array out of bound");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program8 prg8=new Program8();
		prg8.reThrowingException();
	}

}
