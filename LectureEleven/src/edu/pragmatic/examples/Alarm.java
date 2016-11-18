package edu.pragmatic.examples;

public class Alarm {

	public static final String MONDAY = "Monday";
	public static final String TUESDAY = "Tuesday";
	
	
	private String day;
	private int hour;
	
	public void setDay(String day){
		if(day.equals(MONDAY)){
			hour = 8;
		} else if(day.equals(TUESDAY)){
			hour = 10;
		}
		this.day = day;
	}
	
	public String getDay(){
		return day;
	}
	
}
