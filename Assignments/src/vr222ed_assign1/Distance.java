package vr222ed_assign1;

import java.util.Scanner;

public class Distance {
	static Scanner s = new Scanner(System.in);

	//xyxy
	
	public static void main(String[] args) {
		
		double[] num = new double[4];
		double distance = 0;
		System.out.println("Insert point x1");
		num[0] = s.nextDouble();
		System.out.println("Insert point y1");
		num[1] = s.nextDouble();
		System.out.println("Insert point x2");
		num[2] = s.nextDouble();
		System.out.println("Insert point y2");
		num[3] = s.nextDouble();
		distance = Math.sqrt(Math.pow((num[0]-num[2]), 2) + Math.pow((num[1]-num[3]), 2));
		System.out.printf("distance is: %.3f%n", distance);
		s.close();
	}
}
