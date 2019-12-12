package vr222ed_assign2;

public class BirthdayCandles {

	public static void candles() {
		int candles = 0;
		int boxes = 0;
		int age = 0;
		while (age<101) {
			if (age>candles) {
				int bullshitnumberboxesnumberthing = 0;
				while (age>candles) {
					candles = candles + 24;
					boxes++;
					bullshitnumberboxesnumberthing++;
				}
				candles = candles - age;
				System.out.printf("\nAt age %d you must buy %d box(es)", age, bullshitnumberboxesnumberthing);
			}
			else {
				candles = candles - age;
		}
			age++;
	}
		System.out.println( "\nTotal number of boxes; " + boxes + ", Remaining candles: " + candles);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		candles();
	}

}
