package vr222ed_assign2;

import java.util.Scanner;

public class EveryOther {
	
	public static void eo(int start, int end) {
		while (start<end) {
			System.out.printf("%d ", start);
			start = start+2;
		}
	}
	//implement try catch maybe
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int one=0;
		int two=0;
		System.out.println("First number: ");
		one = s.nextInt();
		System.out.println("Second number: ");
		two = s.nextInt();
		eo(one, two);
		s.close();
	}

}
