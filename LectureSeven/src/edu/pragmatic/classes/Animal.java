package edu.pragmatic.classes;

public abstract class Animal {

	private int age;
	private int weight;
	
	public int getAge(){
		return age;
	}
	
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getWeight(){
		return age;
	}
	
	
	public void setWeght(int weght){
		this.age = age;
	}
	
	public void growUp(){
		age++;
		System.out.println("Animal - growUp()");
	}
	
	public void eat(){
		weight++;
		System.out.println("Animal - eat()");
	}
	
	public abstract void printInfo();
	
	public abstract void talk();
}
