package edu.school;

public class Reminder {
	private Event[] event;
	private int number;
	
	public Reminder(Event[] event, int number) {
		number = 0;
		if(number>0 && number<30) {
			event[0] = event[number];
		}
		this.event = event;
		this.number = number;
	}
	
	public void addEvent(Event newEvent) {
		if(number < 30) {
			event[number] = newEvent;
			number ++;
		}
		else {
			System.out.println("Cannot add another event!");
		}
	}
	
	public Event[] getAllEvents(Date date) {
		int br = 0;
		for(int i = 0; i<event.length; i++) {
			if(event[i] == event[i+1]) {
				br++;
			}
		}
		int index = 0;
		Event[] result = new Event[br];
		for(int i = 0; i<event.length; i++) {
			if(event[i].getDate().compareTo(date) == 0) {
				result[index] = event[i];
				index++;
			}
		}
		return result;
	}

}
