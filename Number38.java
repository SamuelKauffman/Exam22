package Fianl;

import java.util.ArrayList;
import java.util.Random;

public class Number38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		Random gen = new Random();
		int n = 10;
		for(int i=0; i<n; i++) {
			num.add(gen.nextInt(31));
		}
		System.out.println("ArrayList 1: " + num);
		for(int i=0; i<n; i++) {
			System.out.println("The index: " + i + ". The numbers: " + num.get(i));
		}
	}

}
