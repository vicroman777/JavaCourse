package vr222ed_assign2;

import java.util.Scanner;

public class Password {

	public static boolean isTenDigits(String password) {
		int counter = 0;
		for (int i = 0; i<password.length(); i++) {
			counter++;
		}
		if (counter >= 10) 
			return true;
		else return false;
	}
	
	public static boolean hasUppercase(String password) {
		int counter = 0;
		for (int i=0; i<password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				counter++;
			}
		}
		if (counter >= 2) {return true;}
		else return false;
	}
	
	public static boolean hasNumbers(String password) {
		int counter = 0;
		for (int i=0; i<password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				counter++;
			}
		}
		if (counter >= 2) {return true;}
		else return false;
	}
	
	public static boolean hasSpecial(String password) {
		int counter = 0;
		for (int i=0; i<password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				counter++;
			}
		}
		if (counter >= 2) {return true;}
		else return false;
	}
	
	public static void password() {
		Scanner s = new Scanner(System.in);
		String password = "";
		System.out.println("Insert a Password: ");
		password = s.nextLine();
		while (!(hasSpecial(password) && hasNumbers(password) && hasUppercase(password) && isTenDigits(password))) {
			System.out.println("Insert a Password: ");
			password = s.nextLine();
		}
		System.out.println("Pass is Valid!");
		s.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		password();
	}

}
