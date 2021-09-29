package assignment3;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DevlabsAlliance Training";
		char[] charArray = str.toCharArray();
		HashMap<Character,Integer> charOccurenceMap = new HashMap<Character,Integer>();
		
		for(int i=0;i<charArray.length;i++) {
			char c = charArray[i];
			int counter = 0;
			for(int j=0;j<charArray.length;j++) {
				if(charArray[j]==c)
					counter+=1;
			}
			
			if (!charOccurenceMap.containsKey(c)) {
				charOccurenceMap.put(c, counter);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : charOccurenceMap.entrySet()) {
			System.out.println(entry.getKey()+" ==> "+entry.getValue());
		}
	}

}
