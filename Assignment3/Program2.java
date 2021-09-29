package assignment3;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "trurt";
		char[] chars = str.toCharArray();
		String reversestr = "";
		for(int i=chars.length-1;i>=0;i--) {
			reversestr+=chars[i];
		}
		
		System.out.println("String: "+str);
		System.out.println("Reverse string: "+reversestr);
		
		if (str.equalsIgnoreCase(reversestr)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}
	}

}
