package edu.school;

public class Date {
	int sec;
	int min;
	int hour;
	int day;
	int month;
	int year;
	public Date(int s, int m, int h, int d, int mon, int y) {
		if(s>=0 && s<=60) {
			sec = s;
		}
		if(m>=0 && m<=60) {
			min = m;
		}
		if(h>=1 && h<=24) {
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
	}// Konstruktorut e za dannite da priemat takiva stoinosti purvonachalno i kogao usloviqta v predniq ne sa izpulneni
	
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
	
	public String LeapYear(Date y) {
		String result = "";
		if(y.year%4!=0) 
			result += "Ne e visokosna";	
		else if(y.year%25 != 0) 
			result += "Visokosna e";	
		else if(y.year%16 != 0) 
			result += "Ne e visokosna";	
		else 
			result += "Visokosna e";	
		return result;
	}
	public void SecIncrease() {
		sec += 1;
	}
	}
	
	

