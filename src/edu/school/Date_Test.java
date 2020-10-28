package edu.school;

import java.util.Scanner;

public class Date_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int temp=0;
		Date test = new Date ();
		test.setSeconds(temp);
		System.out.println("Enter seconds: ");
		temp = scan.nextInt();
		test.setMinutes(temp);
		System.out.println("Enter minutes: ");
		temp = scan.nextInt();
		test.setHour(temp);
		System.out.println("Enter hours: ");
		temp = scan.nextInt();
		test.setDay(temp);
		System.out.println("Enter day: ");
		temp = scan.nextInt();
		test.setMonth(temp);
		System.out.println("Enter month: ");
		temp = scan.nextInt();
		test.setYear(temp);
		System.out.println("Enter year: ");
		temp = scan.nextInt();
		Date test2 = new Date ();
		test2.setSeconds(temp);
		System.out.println("Enter seconds: ");
		temp = scan.nextInt();
		test2.setMinutes(temp);
		System.out.println("Enter minutes: ");
		temp = scan.nextInt();
		test2.setHour(temp);
		System.out.println("Enter hours: ");
		temp = scan.nextInt();
		test2.setDay(temp);
		System.out.println("Enter day: ");
		temp = scan.nextInt();
		test2.setMonth(temp);
		System.out.println("Enter month: ");
		temp = scan.nextInt();
		test2.setYear(temp);
		System.out.println("Enter year: ");
		temp = scan.nextInt();
		System.out.println(test.compareTo(test2));
		if(test.leapYear()==0) 
		{
			System.out.println("The first year is a leap year");
		}
		else 
			System.out.println("The first year is a common year");
		if(test2.leapYear()==0) 
		{
			System.out.println("The second year is a leap year");
		}
		else 
			System.out.println("The second year is a common year");
		System.out.println("Day " + test.numberOfDate(test) + " of the year");
		System.out.println("Week " + test.numberOfWeek(test) + " of the year");
		test.secIncrease(test);
		System.out.println("Enter number of dates: ");
		int n = scan.nextInt();
		Date [] testArray = new Date [n];
		for(int i=0; i<testArray.length; i++) {
			testArray[i] = new Date ();
			testArray[i].setSeconds(temp);
			System.out.println("Enter seconds: ");
			temp = scan.nextInt();
			testArray[i].setMinutes(temp);
			System.out.println("Enter minutes: ");
			temp = scan.nextInt();
			testArray[i].setHour(temp);
			System.out.println("Enter hours: ");
			temp = scan.nextInt();
			testArray[i].setDay(temp);
			System.out.println("Enter day: ");
			temp = scan.nextInt();
			testArray[i].setMonth(temp);
			System.out.println("Enter month: ");
			temp = scan.nextInt();
			testArray[i].setYear(temp);
			System.out.println("Enter year: ");
			temp = scan.nextInt();
		}
		scan.close();
	}
	
	/*public static void bubbleSort(Date [] arr) {
		for(int i = 0; i < arr.length-1; i++)
            for(int j = 0; j < arr.length-i-1; j++)
                if(arr[j] > arr[j+1]){
                    Date temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		
	}*/

}
