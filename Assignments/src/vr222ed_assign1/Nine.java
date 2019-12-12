package vr222ed_assign1;

import java.util.Random;
import java.util.Scanner;

public class Nine {
	
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	public static void game() {
		int humroll = r.nextInt(7);
		int humroll2 = r.nextInt(7);
		System.out.println("you got " + humroll + ", want more?");
		if (s.next().charAt(0) == 'y') {
		System.out.println("you got " + humroll2 + " total " + (humroll+humroll2));
		int machinelearning = r.nextInt(7) + r.nextInt(7);
		int total = humroll + humroll2;
		if (machinelearning<(total) && total < 10 || machinelearning>10 && total<10 ) {
			System.out.println("You won " + machinelearning);
		}
		else System.out.println("It won " + machinelearning);
		}
		
		else if (s.next().charAt(0) == 'n') {s.close(); System.exit(1); }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean game = true;
		while (game) {
			System.out.println("Game?");
			char input = s.next().charAt(0);
			switch (input) {
			case 'y': game(); break;
			
			case 'n': {game = false; s.close(); break; }
			
			default: 
			}
			
}
	}
}
