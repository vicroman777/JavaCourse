package vr222ed_assign2;

import java.util.Scanner;

public class Palindrome {

	static Scanner s = new Scanner(System.in);
	
	public static String removespaces(String string) {
		// \\s is regex \s, can be replaced by " "
		string = string.replaceAll("\\s", "");
		return string;
	}
	
	public static String lowercase(String string) {
		return string.toLowerCase();
	}
	
	
	public static boolean palindrome(String string) {
		
		int p2 = string.length()-1;
		int p1 = 0;
		while (p1<p2) {
			if (string.charAt(p1) != string.charAt(p2)) {
				return false;
			}
			p1++;
			p2--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
		System.out.println("Give a word");
		String input = s.nextLine();
		if (input .equalsIgnoreCase("stop")) {run = false; s.close(); break;}
		if (palindrome(removespaces(lowercase(input)))) {
			System.out.printf("%s is a palindrome\n", input);
		}
		else
			System.out.printf("%s is not a palindrome\n", input);
			
	}
	}

	
}
