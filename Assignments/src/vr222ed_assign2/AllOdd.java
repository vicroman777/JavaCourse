package vr222ed_assign2;

import java.util.Random;

public class AllOdd {

	static Random r = new Random();
	
	public static void populate(int[] n) {
		for (int i=0; i<n.length; i++) {
			n[i] = r.nextInt(101);
		}
	}
	
	public static void toString(int[] n) {
		System.out.println("Complete array:");
		for (int i=0; i<n.length; i++) {
			System.out.print(n[i]+ " ");
		}
	}
	
	public static void allodd() {
		int[] n = new int[10];
		populate(n);
		toString(n);
		System.out.println("\nOdd array:");
		for (int i=0; i<n.length; i++) {
			if (n[i]%2 == 1) {
			System.out.print( n[i]+ " ");
		}
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allodd();
	}

}
