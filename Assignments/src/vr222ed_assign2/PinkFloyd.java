package vr222ed_assign2;

import java.util.stream.IntStream;

public class PinkFloyd {
//alternatives:
//for (int i = 0; i<5; i++) //print
//while (i<5) //print i++
	public static void pinkfloyd() {
				IntStream.range(0, 5).parallel()
				.forEach(j -> {System.out.println("Pink Floyd rules!");});
	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pinkfloyd();
	}

}
