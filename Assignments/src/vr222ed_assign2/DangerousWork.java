package vr222ed_assign2;

import java.util.Scanner;

public class DangerousWork {

	public static void Dangerous(double money) {
			int days = 0;
		  double moneys = 0.01;
		  while (moneys<=money) {
			  moneys = moneys*2;
			  days++;
		  }
		  if (days >= 30) {
			  System.out.println("It would have taken " + days + " days but you died" );
		  }
		  else {System.out.println("It will take " + days + " days");}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("How much money would you like to earn? ");
		double money = s.nextDouble();
		Dangerous(money);
		s.close();
		
	}

}
