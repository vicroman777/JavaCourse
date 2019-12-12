package vr222ed_assign2;

import java.util.Scanner;

public class CalcNumbers {
	
	public static void calc() {
		Scanner s = new Scanner(System.in);
		int number = 0;
		System.out.println("GIB NUMBR OR 0 FOR SUM");
		int choice = s.nextInt();
			while (choice!=0) {
				number = number + choice;
				choice = s.nextInt();
			}
		System.out.println(number);
	s.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc();
	
	}
}
