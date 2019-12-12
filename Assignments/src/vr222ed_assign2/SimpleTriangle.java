package vr222ed_assign2;

import java.util.Scanner;

public class SimpleTriangle {

	
	/*
	 * public static void triangleDraw(int n) { for(int i =0; i<n; i++) {
	 * 
	 * for (int k=2*(n-i); k>=0; k--) { System.out.print("/ "); }
	 * 
	 * for (int j=0; j<=i; j++) { System.out.print("* "); } System.out.println();
	 * 
	 * } }
	 */
	
	public static void traingleDraw(int n) {
		
		for (int i = n; i>0; i--) {
			for (int k = n-i; k>0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Give a positive number: ");
		int number = s.nextInt();
		traingleDraw(number);
		s.close();

	}

}
