package vr222ed_assign2;
import java.text.MessageFormat;
import java.util.Random;

public class Histogram {

	public static void histogram() {
		Random r = new Random();
		int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0;
		String one = "";
		String two = "";
		String three = "";
		String four = "";
		String five = "";
		String six = "";
		
		
		for (int i =0; i<500; i++) {
			
			int n = r.nextInt(6)+1;
			
			if (n == 1) {
				one += "*";
				c1++;
			}
			else if (n == 2) {
				two += "*";
				c2++;
			}
			else if (n == 3) {
				three += "*";
				c3++;
			}
			else if ( n == 4) {
				four += "*";
				c4++;
			}
			else if (n==5) {
				five += "*";
				c5++;
			}
			else if (n==6) {
				six += "*";
				c6++;
			}
			
		}
		//one = MessageFormat.format();
		System.out.printf("One (%d) %s" , c1, one);
		System.out.printf("\nTwo (%d) %s" , c2, two);
		System.out.printf("\nThree (%d) %s" , c3, three);
		System.out.printf("\nFour (%d) %s" , c4, four);
		System.out.printf("\nFive (%d) %s" , c5, five);
		System.out.printf("\nSix (%d) %s" , c6, six);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		histogram();
	}

}
