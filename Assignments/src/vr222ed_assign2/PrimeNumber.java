package vr222ed_assign2;

import java.util.Scanner;

public class PrimeNumber {
	static Scanner s = new Scanner(System.in);
	
	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		else for (int i = 2; i<Math.sqrt(n);i++) {
			if (n%i == 0) {return false;}	
			}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me a number: ");
		int n = s.nextInt();
		while (n>0) {
			if (isPrime(n)) { System.out.println("This is a prime number.");}
			else System.out.println("This is not a prime number.");
			System.out.println("Give me a number: ");
			n = s.nextInt();
		}	
		System.out.println("Good bye!");
		s.close();
	}	
}


