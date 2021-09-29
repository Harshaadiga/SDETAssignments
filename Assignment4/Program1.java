package assignment4;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
	public void CharacterOccurences(String str) {
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}

		for (Character ch : hashMap.keySet()) {
			if (ch == ' ') {
				System.out.println("' ' --> occurs " + hashMap.get(ch) + " times");
			} else {
				System.out.println(ch + " --> occurs " + hashMap.get(ch) + " times");
			}
		}
	}

	public static void main(String a[]) {
		Program1 prg1 = new Program1();
		prg1.CharacterOccurences("This is test of character occurence using Hash map");
	}

}
