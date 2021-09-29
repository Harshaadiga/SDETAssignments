package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
	
	private void checkforleapyear(int year) {
		boolean isleapyear = false;
		
		if (year%4==0){
			if (year%100==0) {
				if (year%400==0) {
					isleapyear=true;
				}else {
					isleapyear=false;
				}
			}else {
				isleapyear=true;
			}
		}
		
		if (isleapyear) {
			System.out.println("Year "+year+" is a leap year");
		}else {
			System.out.println("Year "+year+" is a not leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 leapyear = new Program4();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter year to check leap year or not");
		try {
			int year = Integer.parseInt(br.readLine());
			leapyear.checkforleapyear(year);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
