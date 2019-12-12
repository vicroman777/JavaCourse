package vr222ed_assign1;

import java.util.Scanner;

public class SumOfThree {
	static Scanner s = new Scanner(System.in);
	
	public static int sum(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum + (a%10);
			a = a/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println("Give one three digit number");
		int a = s.nextInt();
		System.out.println("result: " + sum(a));
		s.close();
	}
}
