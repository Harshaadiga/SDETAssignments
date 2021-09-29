package assignment3;

public class Program3 {
	
	public void checkforstring(String str,String str1) {
		if(str.contains(str1)) {
			System.out.println("String \""+str1+"\" is present in string \""+str+"\"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program3 c=new Program3();
		String str="A brown fox ran away fast";
		c.checkforstring(str, "brown");
		
	}

}
