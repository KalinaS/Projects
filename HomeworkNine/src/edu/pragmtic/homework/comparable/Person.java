package edu.pragmtic.homework.comparable;

public class Person implements Comparable<Person>{

	int age;
	
	Person(int age){
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		
		if(this.age < o.age){
			return -1;
		} else if(this.age == o.age){
			return 0;
		} else {
			return 1;
		}
		
	}
	
	@Override
	public String toString(){
		return "Age-" + age;
	}
	
	
	
}
