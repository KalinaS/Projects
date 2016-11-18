package edu.pragmatic.regex;

import java.util.Scanner;
import java.util.regex.*;

public class Demo {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter a text: ");
			String text = sc.nextLine();
			
			String regex = "0|[+-]?[1-9][0-9]*";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(text);
			while(matcher.find()){
				int startIndex = matcher.start();
				int endIndex = matcher.end();
				
				String number = text.substring(startIndex, endIndex);
				System.out.println(number);
			}
		}
		
	}
	
}
