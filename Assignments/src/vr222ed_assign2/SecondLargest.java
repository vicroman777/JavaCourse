package vr222ed_assign2;

import java.util.Scanner;

public class SecondLargest {
	static Scanner s = new Scanner(System.in);

	public static void second() {

		int ints = 0;
		int max = Integer.MIN_VALUE;
		int smax = 0;
		for (; ints<10; ints++)	{
			int choice = s.nextInt();
			if (choice>=max) {
				smax = max;
				max = choice;
			}
			if (choice < max && choice > smax) {
				smax = choice;
			}
			
		}

		System.out.println(smax);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give 10 numbers:");
		second();
		s.close();
	}

}
