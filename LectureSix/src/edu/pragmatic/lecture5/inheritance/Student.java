package edu.pragmatic.lecture5.inheritance;

public class Student {

	int age;
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	void goToSchool(){
		System.out.println("Take the bus.");
	}
	
}
