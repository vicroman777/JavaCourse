package vr222ed_assign1;

import java.util.Scanner;

public class Change {

	static Scanner s = new Scanner(System.in);

	public static void changer() {
		System.out.println("enter sum");
		int sum = s.nextInt();
		System.out.println("enter payment");
		int payment = s.nextInt();
		int th=0, fi=0, tw=0, hu=0, fi2=0, tw2=0, te=0, fi3=0, tw3=0, on=0;
		if (payment<sum) {System.out.println("Sum is bigger than payment");}
			else {
				int left = payment-sum;
				while (left>0) {
				th = left / 1000;
				left = left - (th*1000);
				fi = left / 500;
				left = left - (fi*500);
				tw = left / 200;
				left = left - (tw*200);
				hu = left / 100;
				left = left - (hu*100);
				fi2 = left / 50;
				left = left - (fi2*50);
				tw2 = left / 20;
				left = left - (tw2*20);
				te = left / 10;
				left = left - (te*10);
				fi3 = left / 5;
				left = left - (fi3*5);
				tw3 = left / 2;
				left = left - (tw3*2);
				on = left / 1;
				left = left - (on*1);}		
				System.out.println("1000 " + th + "\n500 " + fi + "\n200 " + tw + "\n100 " + hu + "\n50 " + fi2 + "\n20 " + tw2 + "\n10 " + te + "\n5 " + fi3 + "\n2 " + tw3 + "\n1 " + on); 
				}
		s.close();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		changer();
		}	
	
}
