package Fianl;

import java.util.Scanner;

public class Number35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int x = scan.nextInt();
		if(x >= 18) {
			System.out.println("Adult!");
		}
		else
			System.out.println("Minor!");
	}

}
