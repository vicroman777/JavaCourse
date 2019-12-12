package vr222ed_assign2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto {
	static Random r = new Random();
	//crossreferenced with intstreams off google, not for your eyes, mr TA
	public static void fancy() {
		System.out.println("The numbers this week:");
		new Random().ints(1,36).distinct().limit(7).forEach(System.out::println);
	}
	
	public static void weird() {
		int[] num = new int[35];
		int[] ordered = new int[7];
		for (int i = 0; i<num.length; i++) {
			num[i] = i+1;
		}
		for (int j = 0; j<num.length; j++) {
			int k = r.nextInt(num.length);
			int temp = num[k];
			num[k] = num[j];
			num[j] = temp;
		}
		System.out.println("The numbers this week:");
		for (int l = 0; l<7; l++) {
			ordered[l] = num[l];
		}
		Arrays.sort(ordered);
		for (int k = 0; k<7; k++) {
			System.out.print(ordered[k] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weird();
	}

}
