package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program6 {
	
	public double areaofTriangle(double base, double height) {
		return 0.5*(base*height);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			
			System.out.println("Enter base of triangle");
			double base = Double.parseDouble(br.readLine());
			
			System.out.println("Enter height of triangle");
			double height = Double.parseDouble(br.readLine());
			
			Program6 calcarea = new Program6();
			System.out.println("Area of the triangle: "+calcarea.areaofTriangle(base, height));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
