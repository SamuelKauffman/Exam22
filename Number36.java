package Fianl;

import java.util.Scanner;

public class Number36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day of the week: ");
		int day = scan.nextInt();
		
		switch(day) {
		
		case 1: 
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		default:
			System.out.println("Holiday!");
		}
	}

}
