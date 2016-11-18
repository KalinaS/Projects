package edu.pragmatic.classes;

public class Fish extends Animal{

	public void swim(){
		System.out.println("Fish - swim()");
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am fish with age: " + getAge());
	}

	@Override
	public void talk() {
		System.out.println("Fish - talk()");
	}
	
	
	
}
