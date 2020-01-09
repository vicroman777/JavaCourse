package vr222ed_assign3;

public class SwedishID {
	DateFormat birthday = new DateFormat();
	int checksum;
	boolean valid;
	
	SwedishID(String x) {
		this.birthday.setYear(Integer.parseInt(x.substring(0, 4)));
		this.birthday.setMonth(Integer.parseInt(x.substring(4, 6)));
		this.birthday.setDay(Integer.parseInt(x.substring(6, 8)));
		checksum = Integer.parseInt(x.substring(9,13));

	}
	
	public String showID() {
		return String.format("%s-XXXX", birthday.getDate(true));
	}
	
	public boolean isFemale() {
		int thirddigit = (checksum % 100) /10;
		if (thirddigit%2 == 0) {
			return true;
		}
		else return false;
	}
	
	public int comparedTo(SwedishID otherID) {
		String bday = birthday.getDate(false);
		String bdaytwo = otherID.birthday.getDate(false);
		return bday.compareTo(bdaytwo);
	}
	public void sum(int x) {
		int sum = 0;
		while (x!=0) {
			sum = sum + x%10;
			x = x/10;
		}
	}
	public boolean validID() {
		int i = 0;
		int sum=0;
		int checksum = this.checksum;
		int[] numbers = new int[10];
		int date = Integer.parseInt(birthday.getDate(false));
		for (i = numbers.length-5; i>=0; i--) {
			numbers[i] = date%10;
			date= date/10;
		}
		for (i = numbers.length-1; i>numbers.length-5; i--) {
			numbers[i] = checksum%10;
			checksum = checksum/10;
		}
		for (i=0; i<numbers.length-1; i++) {
			int temp=0;
			int moduloSum=0;
			int tempSum=0;
			if (i%2 ==0) {
			temp = numbers[i]*2;
			}
			else {temp = numbers[i];}
			if (temp >10) {
				while (temp>0) {
					moduloSum = temp%10;
					tempSum = moduloSum + tempSum;
					temp = temp/10;
				}
			numbers[i] = tempSum;
			}
			else {numbers[i] = temp;}
			}
		for (i=0; i<numbers.length-1; i++) {
			sum = sum+numbers[i];
		}
		sum = sum%10;
		sum = 10-sum;
		if (numbers[numbers.length-1] == sum) {
			return true;
		}
		else {return false;}
		
	}
}
