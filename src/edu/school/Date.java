package edu.school;

public class Date {
	int sec;
	int min;
	int hour;
	int day;
	int month;
	int year;
	public Date(int s, int m, int h, int d, int mon, int y) {
		if(s>=0 && s<=59) {
			sec = s;
		}
		if(m>=0 && m<=59) {
			min = m;
		}
		if(h>=0 && h<=23) {
			hour = h;
		}
		if(d>=1 && d<=31) {
			day = d;
		}
		if(mon>=1 && mon<=12) {
			month = mon;
		}if(y>=1) {
			year = y;
		}
	}// Konstruktorut shte proverqva dali dannite sa validni stoinosti
	public Date() {
		sec = 0;
		min = 0;
		hour = 1;
		day = 1;
		month = 1;
		year = 1;
	}// Konstruktorut e za dannite da priemat takiva stoinosti purvonachalno i kogato usloviqta v predniq ne sa izpulneni
	
	public int getSec() {
		return sec;
	}
	public int getMin() {
		return min;
	}
	public int getHour() {
		return hour;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public int compareTo(Date d) {
		if(year > d.year) {
			return 1;
		}
		else if(year == d.year && month > d.month) {
				return 1;
			}else if(month == d.month && day > d.day) {
				return 1;
			}else if(day == d.day && hour > d.hour) {
				return 1;
			}else if(hour == d.hour && min > d.min) {
				return 1;
			}else if(min == d.min && sec > d.sec) {
				return 1;
			}else if(year == d.year && month == d.month && day == d.day && hour == d.hour && min == d.min && sec == d.sec) {
				return 0;
			}else
				return -1;
		}
	
	public Boolean LeapYear(Date y) {
		if(y.year%4!=0) 
			return false;	
		else if(y.year%25 != 0) 
			return true;
		else if(y.year%16 != 0) 
			return false;	
		else 
			return true;	
	}
	
	public int NumberOfDate(Date d) {
		if(d.month == 1) {
			return d.day;
		}else if(d.month == 2) {
			d.day += 31;
			return d.day;
		}else if(d.month == 3) {
			d.day += 59;
		}else if(d.month == 3 && d.LeapYear(d)) {
			d.day += 60;
			return d.day;
		}else {
			for(int i=3; i<=d.month; i++) {
				if(i%2 == 0)
					d.day += 30;
				d.day += 31;
			}
			return d.day;
		}
				
		
		return d.day;
		
			
	}
	
	public void SecIncrease() {
		sec += 1;
		if(sec == 60) {
			min += 1;
			if(min == 60) {
				hour += 1;
				if(hour == 24) {
					day += 1;
					if(day == 31) {
						month += 1;
						if(month == 12) {
							year += 1;
						}
					}
				
				}
			}
		}
	}
}
	
	

