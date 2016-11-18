package edu.pragmtic.homework.reverse;

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
		
		for(int i = list.size() - 1; i >= 0; i--){
			System.out.println(list.get(i));
		}
		
		
		
	}
	
}
