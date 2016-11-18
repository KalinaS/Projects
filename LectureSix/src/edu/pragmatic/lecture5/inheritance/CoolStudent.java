package edu.pragmatic.lecture5.inheritance;

public class CoolStudent extends Student {

	String haircutStyle;
	
	CoolStudent(String name){
		super(name);
		
		haircutStyle = "cool";
	}
	
	@Override
	void goToSchool(){
		boolean isCarClean = true;
		if(isCarClean){
			System.out.println("Take the car.");
		} else {
			super.goToSchool();
		}
		
	}
	
}
