package edu.school;

public enum DayOfWeek {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private int dayNumber;
	private DayOfWeek(int weekDay) {
		dayNumber = weekDay;
	}
	public int getNumberOfDay() {
		return dayNumber;
	}
	
	public String toString() {
		if(dayNumber == 1)
			return "Monday";
		else if(dayNumber == 2)
			return "Tuesday";
		else if(dayNumber == 3)
			return "Wednesday";
		else if(dayNumber == 4)
			return "Thursday";
		else if(dayNumber == 5)
			return "Friday";
		else if(dayNumber == 6)
			return "Saturday";
		else if(dayNumber == 7)
			return "Sunday";
		return null;
	}
	
	public String toString(int numberOfLetters) {
		char[] arrayDays = getConstant(dayNumber).toString().toCharArray();;
		String result = "";
		while(numberOfLetters < arrayDays.length) {
			for(int i=0; i<numberOfLetters; i++) {
				result += arrayDays[i];
			}
		}
		return result;
	}
	public static DayOfWeek getConstant(int day) {
		if(day == 1)
			return MONDAY;
		else if(day == 2)
			return TUESDAY;
		else if(day == 3)
			return WEDNESDAY;
		else if(day == 4)
			return THURSDAY;
		else if(day == 5)
			return FRIDAY;
		else if(day == 6)
			return SATURDAY;
		else if(day == 7)
			return SUNDAY;
		return null;
		
	}
	
	

}
