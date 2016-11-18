package edu.pragmatic.classes;

public class Dog extends Animal {

	@Override
	public void printInfo() {
		System.out.println("I am dog with age: " + getAge());
	}
	
	@Override
	public void talk() {
		System.out.println("Dog - talk()");
	}
	
}
