package vr222ed_assign2;

import java.util.Scanner;

public class DateFormat2 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date d = new date(1997, 05, 02, '/', 'l');
		System.out.println(d.toString());
	}

}

 class date {
	 int year;
	 int month;
	 int day;
	 char type;
	 char punctuation;
	 
	public date(int year, int month, int day, char punctuation, char type) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.type = type;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public String getDate(boolean fullYear) {
		switch (this.type) {
		case 'b':	
			if (fullYear) {
			return String.format("%d/%d/%d", year, month, day);}
			else {String.format("%d/%d/%2d", year, month, day);};
		case 'l':
			if (fullYear) {
			return String.format("%d/%d/%d", day, month, year);}
			else {String.format("%d/%d/%2d", year, month, day);};
		case 'm':
			if (fullYear) {
			return String.format("%d/%d/%d", month, day, year);}
			else {String.format("%d/%d/%2d", month, day, year);};
		
		default: return "";
		} 
	}
	
	public String toString() {
		String s = "";
		if (this.type=='b') {
			s = String.format("%d/%d/%d", year, month, day);
		}
		if (this.type=='l') {
			s = String.format("%d/%d/%d", day, month, year);
		}
		if (this.type=='m') {
			s = String.format("%d/%d/%d", month, day, year);
		}
		return s;
	}
	 
	
}