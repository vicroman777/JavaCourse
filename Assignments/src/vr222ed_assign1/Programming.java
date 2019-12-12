package vr222ed_assign1;

import java.util.Arrays;
import java.util.Scanner;

public class Programming {
	static Scanner s = new Scanner(System.in);
	static String arr[] = new String[3];
	static String arrc[] = new String[3];
	
	public static void main(String[] args) {
		System.out.println("Type three words/programming languages or anything, im not your boss man");
		for(int j=0; j<3; j++) {
		arr[j] = s.nextLine();
		}
		Arrays.sort(arr, String::compareToIgnoreCase);
	
	for (int l=0; l<3; l++) {
		System.out.println(arr[l]);
	}
}
}
