package edu.pragmtic.homework.console;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s;
		List<String> list = new LinkedList<>();
		
		do{
			s = input.nextLine();
			
			if(!s.equals("END OF TEXT")){
				list.add(s);
			}
			
		} while (!s.equals("END OF TEXT"));
		
		for(String line : list){
			System.out.print(line);
		}
	}
	
}
