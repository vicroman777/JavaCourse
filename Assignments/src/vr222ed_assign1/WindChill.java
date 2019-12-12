package vr222ed_assign1;

import java.util.Locale;
import java.util.Scanner;

public class WindChill {
	static Scanner s = new Scanner(System.in);
	
	  public static void main(String[] args) {
		 s.useLocale(Locale.US);
		  System.out.println("input Temp");
		  double temp = s.nextDouble();
		  System.out.println("input speed");
		  double speed = (s.nextDouble()*18)/5;
		  System.out.println(11.37*Math.pow(speed, 0.16));
		  double twc = 13.12 + (0.6215*temp) - (11.37*Math.pow(speed, 0.16)) + ((0.3965*temp)*Math.pow(speed, 0.16));
		  System.out.printf("twc is " + "%.1f", twc);
		  s.close();
		 
	  }
}
