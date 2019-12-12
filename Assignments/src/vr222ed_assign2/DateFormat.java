package vr222ed_assign2;

import java.util.Scanner;

public class DateFormat {
	static Scanner s = new Scanner(System.in);
	
	public static String date(int year, int month, int day, char type) {
		String date = "";
		if (type=='b') {
			date = String.format("%04d/%02d/%02d", year, month, day);
		}
		if (type=='l') {
			date = String.format("%02d/%02d/%04d", day, month, year);
		}
		if (type=='m') {
			date = String.format("%02d/%02d/%04d", month, day, year);
		}
		return date;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a year");
		int year = s.nextInt();
		System.out.println("Enter a month");
		int month = s.nextInt();
		System.out.println("Enter a day");
		int day = s.nextInt();
		System.out.println("Enter a format (b/l/m)");
		char type = s.next().charAt(0);
		System.out.println(date(year,month,day,type));
		s.close();
	}

}
