package edu.pragmatic.homework3;

import java.util.ArrayList;
import java.util.List;

public class Human {

	String name;
	String surname;
	int age;
	int height;
	double wight;
	boolean isMan;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void hasParents() {
		System.out.printf("%s has a mother and a father.", name);
		System.out.println();
	}

	public void hasFriends() {	
		List<String> friends = new ArrayList<String>();
		friends.add("Ivan");
		friends.add("Stoyan");
		friends.add("Maria");
		
		System.out.printf("%s's friends are: ", name);
		System.out.println(friends);
	}

}
