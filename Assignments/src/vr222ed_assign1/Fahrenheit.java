package vr222ed_assign1;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {

	public static float ftoc(float fh) 
	{
		return (((fh-32)*5)/9);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
		System.out.println("Provide a temperature in F");
	float f = s.nextFloat();
	System.out.printf(Locale.US, "Corresponding temperature in Celsius is %.3f", ftoc(f));
	}

}
