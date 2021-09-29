package assignment2;

public class Program6 {
	public static void main(String[] args) {
		int[] arr = { 20, 13, 4, 12, 15, 12, 15, 17, 13 };
		
		
		System.out.println("Duplicate values: ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
