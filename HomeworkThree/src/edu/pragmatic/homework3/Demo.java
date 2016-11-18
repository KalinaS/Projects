package edu.pragmatic.homework3;

import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.setName("Hristo");
		human.hasParents();
		human.hasFriends();
		
		System.out.println();
		
		System.out.println("Current date is: " + CurrentDate.showCurrentDate());
	}
	
}
