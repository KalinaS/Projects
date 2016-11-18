package edu.pragmtic.homework.removeletters;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		Set<Character> chars = new LinkedHashSet<>();
		
		String input = "This is an example";
		
		for(int i = 0; i < input.length(); i++){
			chars.add(input.charAt(i));
		}
		for (Character character : chars) {
			System.out.print(character);
		}
		
	}
	
}
