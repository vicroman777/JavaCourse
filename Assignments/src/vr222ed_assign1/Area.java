package vr222ed_assign1;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static double calc(float r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Give a radius for the circle");
		float r = s.nextFloat();
		System.out.printf(Locale.US,"The area of a circle with radius %.1f is %.1f", r, calc(r));
		s.close();
	}

}
