package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of array elements");
		try {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]= Integer.parseInt(br.readLine());
			}
			
			System.out.println("Array elements are: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+", ");
			}
			
			System.out.println("");
			System.out.println("-----------------------");
			System.out.println("Reverse the array elements");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+", ");
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
