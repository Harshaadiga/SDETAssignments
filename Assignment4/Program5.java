package assignment4;

import java.util.HashSet;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {						
			
		    //create object of HashSet						
		    HashSet<Integer> hashSet = new HashSet<Integer>();
		    
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter number of elements required in Hash set");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Enter <Integer> value");
				int integer = sc.nextInt();
				hashSet.add(integer);
			}
			sc.close();				
		   						
		    /*						
		    *  To copy elements of HashSet object into array use						
		    *  Object[] toArray() method.						
		    */
		    Object[] objArray = hashSet.toArray();						
		   						
		    //display contents of Object array						
		    System.out.println("HashSet elements are copied into an Array.Now Array Contains..");						
		    for(int i=0; i < objArray.length ; i++)						
		      System.out.println(objArray[i]);						
		  }

}
