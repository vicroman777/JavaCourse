package vr222ed_assign4;

import java.util.Scanner;

public class SafeDateMain {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat date = new DateFormat();
		boolean flag = true;
		date.setYear(1);
		date.setPunctuation('/');
		date.setFormat('l');
		while (flag ) {
			try {
				System.out.println("Give me a year: ");
				date.setYear(s.nextInt());
				if (date.getYear() == 0) {
					flag = false; System.out.println("Bye!"); break;
				}
				System.out.println("Give me a month: ");
				date.setMonth(s.nextInt());
				System.out.println("Give me a day: ");
				date.setDay(s.nextInt());	
				System.out.println("The date is " + date.getDate(true));
			}
			catch (Exception e) {
				System.out.println("This is not possible because " + e);
			}
			
		}
	}

}
