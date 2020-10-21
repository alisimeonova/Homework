package edu.school;

public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date test = new Date(21, 12, 10, 21, 10, 2020);
		Date d = new Date(33, 21, 3, 12, 8, 2010);
		Date y = new Date(21, 12, 10, 21, 10, 2029);
		System.out.println(test.compareTo(d));
		System.out.println(y.LeapYear(y));
	}

}
