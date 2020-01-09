package vr222ed_assign4;

public class DateFormat {

		private int year;
		private int month;
		private int day;
		private char type = 'b';
		private char punctuation = ' ';
		private boolean valid = true;
		private boolean leap;
		
		public DateFormat () {};
		
		public DateFormat(int year, int month, int day, char punctuation, char type) {
			super();
			this.year = year;
			checkYear();
			this.month = month;
			checkMonth();
			this.day = day;
			checkDay();
			this.type = type;
			if (punctuation == '!') {
				this.punctuation = ' ';
			}
			else {this.punctuation = punctuation;}
		}
		protected int getYear() {
			return year;
		}
		protected int getMonth() {
			return month;
		}
		protected int getDay() {
			return day;
		}
		protected void setYear(int year) {
			this.year = year;
			checkYear();
		}
		
		protected void setMonth(int month) {
			this.month = month;
			checkMonth();
		}
		
		protected void setDay(int day) {
			this.day = day;
			checkDay();
		}
		
		protected void setFormat(char type) {
			this.type = type;
		}
		
		protected char getPunctuation() {
			return punctuation;
		}
		protected void setPunctuation(char punctuation) {
			this.punctuation = punctuation;
		}
		
		protected String getDate(boolean fullYear) {
			String date = "";
			if (valid) {
			switch (this.type) {
			case 'b':	
				if (fullYear) {
				date = String.format("%04d%s%02d%s%02d", year, this.punctuation, month, this.punctuation, day);break;}
				else {date = String.format("%2d%s%02d%s%02d", year%100, this.punctuation, month,this.punctuation, day);break;}
			case 'l':
				if (fullYear) {
				date = String.format("%02d%s%02d%s%04d", day,this.punctuation, month,this.punctuation, year);break;}
				else {date = String.format("%02d%s%02d%s%02d", day, this.punctuation, month,this.punctuation, year%100);break;}
			case 'm':
				if (fullYear) {
				date = String.format("%02d%s%02d%s%04d", month,this.punctuation, day,this.punctuation, year);break;}
				else {date = String.format("%02d%s%02d%s%02d", month, this.punctuation, day,this.punctuation, year%100);break;}
			} 
			if (punctuation == ' ') {
				date = date.replaceAll(" ", "");
				return date;
			}
			return date;
			}
			
			else return String.format("This is not a valid date");
		}
		
		public void checkMonth() {
			if (this.month >12 || this.month<0) {
				valid = false;
				throw new IllegalArgumentException("Month is wrong");
			}
		}
		
		public void checkYear() {
			if (year%400 == 0) {
				leap = true;
			}
			else if (year%100==0) {
				leap = false;
			}
			else if (year%4==0) {
				leap = true;
			}
			else leap = false;
		}
		
		public void checkDay() {
			switch (this.month) {
			case 4:
				checkDayHelper(); break;
			case 6:
				checkDayHelper(); break;
			case 9:
				checkDayHelper(); break;
			case 11:
				checkDayHelper(); break;
			}
			if (!leap && this.day>28) {
				valid = false;
				throw new IllegalArgumentException("February is wrong");
			}
			if (this.day>31 || this.day <1) {
				valid = false;
				throw new IllegalArgumentException("Day is wrong");

			}
		}
		
	public void checkDayHelper() {
		if(this.day>30) {
			valid = false;
			throw new IllegalArgumentException("Day is wrong -- month/day");

		}
	}

	
		 
		
	}



