package Fianl;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Number34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a double-floating point number: ");
		double x = scan.nextDouble();
		System.out.println("The result is: " + Math.sqrt(x));
		DecimalFormat D = new DecimalFormat("0.##");
		System.out.println("The formatted result is: " + D.format(Math.sqrt(x)));
		
	}

}
