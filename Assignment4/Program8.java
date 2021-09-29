package assignment4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Program8 {
	
	public static void main(String[] args) {

		Hashtable<String,String> hashTable = new Hashtable<String,String>();
		
		hashTable.put("1", "One");
		hashTable.put("2", "Two");
		hashTable.put("3", "Three");
		
		Set<String> set = hashTable.keySet();

		System.out.println("Set created from Hashtable Keys contains :");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
