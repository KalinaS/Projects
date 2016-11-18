package edu.pragmatic.examples;

public class Demo {

	public static void main(String[] args) {
		
		Alarm a = new Alarm();
		a.setDay(Alarm.MONDAY);
		
		if(a.getDay().equals(Alarm.MONDAY)){
			System.out.println("Alarm is set to Monday.");
		}
		
		AlarmTwo a2 = new AlarmTwo();
		a2.setDay(Day.MONDAY);
		
		if(a2.getDay() == Day.MONDAY){
			System.out.println("Alarm is set to Monday.");
		}
		
		System.out.println(Day.MONDAY.getName() + " " + Day.MONDAY.getNumber());
		
		System.out.println(Day.values().length);
	}
	
}
