package vr222ed_assign1;

import java.util.Scanner;

public class DoctorWho {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("What year?");
		int year = s.nextInt();
		if (year<1990 && year>1962) {
			System.out.println("That was the original series.");
		}
		else if (year>2004 && year<2021) {
			System.out.println("That is the modern doctor");
		}
		else if (year >=1990 && year<=2004) {
			System.out.println("That year was a pause");
		}
		else if (year <= 1962) { System.out.println("The doctor was not born yet");
		
		}
		else
			System.out.println("Hopefully there will be a doctor");
		s.close();
		
	}
}
