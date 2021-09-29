package assignment3;

import java.util.Arrays;

public class Program4 {
	
	public void convertStringToCharArray(String str) {
		char[] charArray = str.toCharArray();
		System.out.println("String to Char Array: "+ Arrays.toString(charArray));

	}
	
	public void convertCharArrayToString(char[] charArray) {
		String str = new String(charArray);
		System.out.println("Char Array to String: "+str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 prg4 = new Program4();
		
		String str = "BROADRIDGE";
		char[] charArray = {'B','R','O','A','D','R','I','D','G','E'};
		prg4.convertStringToCharArray(str);
		prg4.convertCharArrayToString(charArray);
	}

}
