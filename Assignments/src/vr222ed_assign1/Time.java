package vr222ed_assign1;

import java.util.Scanner;

public class Time {
	public static void time(int sec) {
		System.out.println((sec/3600) + " hours " + ((sec/60)%60) + " minutes " + (sec%60) + " seconds");
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give a number of seconds:");
		int sec = s.nextInt();
		time(sec);
		s.close();
	}

}
