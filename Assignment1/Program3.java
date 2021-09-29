package assignment1;

import java.io.*;

public class Program3 {
	
	private void sortarrayelements(int[] arr) {
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted elements: ");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {

		Program3 obj = new Program3();
		System.out.println("Enter 5 array elements to sort");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			try {
				arr[i]= Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Array elements are:");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		obj.sortarrayelements(arr);
	}

}
