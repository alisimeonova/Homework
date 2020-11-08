package edu.school;

import java.util.Calendar;


public class Date {
	private int seconds;
	private int minutes;
	private int hour;
	private int day;
	private int month;
	private int year;
	public Date(int s, int m, int h, int d, int mon, int y) {
		if(s>=0 && s<=59) {
			seconds = s;
		}
		if(m>=0 && m<=59) {
			minutes = m;
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
		seconds = 0;
		minutes = 0;
		hour = 1;
		day = 1;
		month = 1;
		year = 1;
	}// Konstruktorut e za dannite da priemat takiva stoinosti purvonachalno i kogato usloviqta v predniq ne sa izpulneni
	
	public int getSeconds() {
		return seconds;
	}
	public int getMinutes() {
		return minutes;
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
	
	public void setSeconds(int secondsValue) {
		seconds = secondsValue;
	}
	public void setMinutes(int minutesValue) {
		minutes = minutesValue;
	}
	public void setHour(int hourValue) {
		hour = hourValue;
	}
	public void setDay(int dayValue) {
		day = dayValue;
	}
	public void setMonth(int monthValue) {
		month = monthValue;
	}
	public void setYear(int yearValue) {
		year = yearValue;
	}
	
	public int compareTo(Date d) {
		if(year > d.getYear()) {
			return 1;
		}
		else if(year == d.getYear() && month > d.getMonth()) {
				return 1;
			}else if(month == d.getMonth() && day > d.getDay()) {
				return 1;
			}else if(day == d.getDay() && hour > d.getHour()) {
				return 1;
			}else if(hour == d.getHour() && minutes > d.getMinutes()) {
				return 1;
			}else if(minutes == d.getMinutes() && seconds > d.getSeconds()) {
				return 1;
			}else if(year == d.getYear() && month == d.getMonth() && day == d.getDay() && hour == d.getHour() && minutes == d.getMinutes() && seconds == d.getSeconds()) {
				return 0;
			}else
				return -1;
		}
	public int compareTo2(Date d) {
		if(year > d.getYear()) {
			return 1;
		}
		else if(year == d.getYear() && month > d.getMonth()) {
				return 1;
			}else if(month == d.getMonth() && day > d.getDay()) {
				return 1;
			}else if(year == d.getYear() && month == d.getMonth() && day == d.getDay()) {
				return 0;
			}else
				return -1;
	}
	
	public int leapYear() {
		int leap=0;
		if(year%4 != 0) 
			return leap++;	
		else if(year%25 != 0) 
			return leap;
		else if(year%16 != 0) 
			return leap++;	
		else 
			return leap;	
	}
	
	public int numberOfDate(Date d) {
		int br = 0;
		if(d.getMonth() == 1)
			return d.getDay();
		else {
			for(int i=0; i<=d.getMonth(); i++ ) {
				if(d.getMonth() == 2 && d.leapYear()==0) {
					br += 29;
				}
				else if(d.getMonth() == 2) {
					br += 28;
				}
				else if(d.getMonth() == 1 || d.getMonth() == 3 || d.getMonth() == 5 || d.getMonth() == 7 || d.getMonth() == 8 || d.getMonth() == 10 || d.getMonth() == 12) {
					br += 31;
				}
				else
					br += 30;
			}
			
			br += d.getDay();
			return d.getDay();
				
	}
}
	public int numberOfWeek(Date d) {
		int week = 0;
		week = numberOfDate(d) / 7 + 1;
		return week;
	}
	
	public void secIncrease(Date d) {
		d.setSeconds(d.getSeconds() + 1);
		if(d.getSeconds() >= 60) {
			d.setSeconds(d.getSeconds() - 60);
			d.setMinutes(d.getMinutes() + 1);
			if(d.getMinutes() >= 60) {
				d.setMinutes(d.getMinutes() - 60);
				d.setHour(d.getHour() + 1);
				if(d.getHour() >= 24) {
					d.setHour(d.getHour() - 24);
					d.setDay(d.getDay() + 1);
						if(d.getDay() > 28 && d.getMonth() == 2 && d.leapYear() == 1) {
							d.setDay(d.getDay() - 28);
							d.setMonth(d.getMonth() + 1);
							if(d.getMonth() >= 12) {
								d.setMonth(d.getMonth() - 12);
								d.setYear(d.getYear() + 1);
							}
						} 
						else if(d.getDay() > 29 && d.getMonth() == 2 && d.leapYear() == 0) {
							d.setDay(d.getDay() - 29);
							d.setMonth(d.getMonth() + 1);
							if(d.getMonth() >= 12) {
								d.setMonth(d.getMonth() - 12);
								d.setYear(d.getYear() + 1);
							}
						} 
						else if(d.getMonth() > 30
								&& (d.getMonth() == 4 || d.getMonth() == 6 || d.getMonth() == 9 || d.getMonth() == 11)) {
							d.setDay(d.getDay() - 30);
							d.setMonth(d.getMonth() + 1);
							if(d.getMonth() >= 12) {
								d.setMonth(d.getMonth() - 12);
								d.setYear(d.getYear() + 1);
							}
						} 
						else if(d.getDay() > 31) {
							d.setDay(d.getDay() - 31);
							d.setMonth(d.getMonth() + 1);
							if(d.getMonth() >= 12) {
								d.setMonth(d.getMonth() - 12);
								d.setYear(d.getYear() + 1);
							}
					}
				}
			}
		}
	}

	public String ToString()
	{
		return hour + ":" + minutes + ":" + seconds + " of " + day + "." + month + "." + year ;  
	}
}
	
	

