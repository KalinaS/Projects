package edu.pragmatic.classes;

public class Bird extends Animal {

	public void fly() {
		System.out.println("Bird - fly()");
	}

	//1st solution
	@Override
	public void printInfo() {
		System.out.println("I am bird with age: " + getAge());
	}
	
	@Override
	public void talk() {
		System.out.println("Bird - talk()");
	}
}
