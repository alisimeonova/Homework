package edu.school;

public class Event {
	private Date date;
	private String name;
	
	public Date getDate() {
		return date;
	}
	public String getName() {
		return name;
	}
	
	public Event(Date d, String n) {
		if(name != null && !name.isEmpty())
			name = n;
		if(date != null)
			date = d;
		
	}
	
	public Event() {
		date = new Date();
		name = "";
	}
	
	public String toString() {
		return name + " " + date;
	}

}
