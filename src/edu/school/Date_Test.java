package edu.school;

public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date test1 = new Date(21, 12, 10, 21, 5, 2020);
		Date test2 = new Date(33, 21, 3, 12, 8, 2010);
		Date test3 = new Date(21, 12, 10, 21, 10, 2029);
		System.out.println(test1.compareTo(test2));
		if(test3.LeapYear(test3)) {
			System.out.println("Godinata e visokosna");
		}
		System.out.println("Godinata ne e visokosna");
		System.out.println(test1.NumberOfDate(test1));
	}

}
