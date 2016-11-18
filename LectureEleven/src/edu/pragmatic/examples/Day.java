package edu.pragmatic.examples;

public enum Day {

	MONDAY(1, "Monday"),
	TUESDAY(2, "Tuesday"),
	WEDNESDAY(3, "Wednesday"),
	THIRSDAY(4, "Thirsday"),
	FRIDAY(5, "Friday"),
	SATURDAY(6, "Saturday"),
	SUNDAY(7, "Sunday");
	
	private int number;
	private String name;
	
	Day(int number, String name){
		this.number = number;
		this.name= name;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getName(){
		return name;
	}
}
