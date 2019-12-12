package vr222ed_assign1;

import java.util.Scanner;

public class Quote {
	
	public static void quoter(String sentence) 
	{
		System.out.println("You said: " + "\"" + sentence + "\"");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Give something to quote");
		String q = s.nextLine();
		quoter(q);
		s.close();
		
	}

}
