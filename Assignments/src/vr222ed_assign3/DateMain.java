package vr222ed_assign3;


public class DateMain {

	public static void main(String[] args) {
		DateFormat date1 = new DateFormat(1977, 5, 25, '!', 'b');
		DateFormat date2 = new DateFormat();
		date2.setYear(1980);
		date2.setMonth(5);
		date2.setDay(17);
		date2.setPunctuation('/');
		date2.setFormat('l');
		DateFormat date3 = new DateFormat(1983, 5, 25, '-', 'm');
		DateFormat date4 = new DateFormat(1999, 13, 34, '-', 'm');
		System.out.println(date1.getDate(false));
		System.out.println(date2.getDate(true));
		System.out.println(date3.getDate(false));
		System.out.println(date4.getDate(true));
		
		DateFormat date5 = new DateFormat(2010, 4, 31, '/', 'b');
		DateFormat date6 = new DateFormat(2016, 2, 29, '/', 'b');
		DateFormat date7 = new DateFormat(2015, 2, 29, '/', 'm');
		DateFormat date8 = new DateFormat(2014, 2, 29, '/', 'l');
		DateFormat date9 = new DateFormat(2020, 2, 29, '/', 'l');
		DateFormat date10 = new DateFormat(1900, 2, 29, '-', 'b');
		System.out.println(date5.getDate(false));
		System.out.println(date6.getDate(true));
		System.out.println(date7.getDate(false));
		System.out.println(date8.getDate(true));
		System.out.println(date9.getDate(false));
		System.out.println(date10.getDate(true));
	}

}
