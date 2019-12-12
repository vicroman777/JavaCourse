package vr222ed_assign2;

import java.util.Scanner;

public class Diamonds {
//leveraged triangle missing input validation
	public static void diamondDraw(int n) {
		for(int i =0; i<n; i++) {
			
			for (int k=(n-i); k>=0; k--) {
				System.out.print(" ");
			}
			
			for (int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
            System.out.println(); 
		}
	for(int i=n-2; i>=0; i--) {
				
				for (int k=(n-i); k>=0; k--) {
					System.out.print(" ");
				}
				
				for (int j=0; j<=i*2; j++) {
					System.out.print("*");
				}
	            System.out.println(); 
	
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Give a positive number:");
		int i = s.nextInt();
		while (i>0) {
		diamondDraw(i);
		System.out.println("Give a positive number:");
		i = s.nextInt();
		}
		s.close();
	}

}
