package Fianl;

import java.util.Scanner;

public class Number37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		if(num%2==0 && num>10) {
			System.out.println("Even and greater than 10!");
		}
		if(num%2==0 && num<10) {
			System.out.println("Even and less than 10");
		}
		if(num%2!=0 && num<10) {
			System.out.println("Odd and less than 10");
		}
		else{
			System.out.println("Odd and greater than 10");
		}
	}

}
