package vr222ed_assign1;


public class RandomSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		int sum = 0;
		System.out.println("Five random numbers:");
		for (int i=0; i<5; i++) {
			num[i] = (int) (Math.random()*100);
			sum = sum + num[i];
			System.out.printf("%d ", num[i]);
		}
		
		System.out.println("\nsum is " + sum);
	}

}
