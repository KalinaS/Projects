package edu.pragmtic.homework.registry;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws SizeLimitReachedException {
		
		Registry<Integer> regint = new Registry<>("Integer registry", 1);
		
		System.out.println(regint.getSize());
		regint.addElement(3);
		System.out.println(regint.getSize());
		regint.addElement(5);
		System.out.println(regint.getSize());
		regint.addElement(5);
		System.out.println(regint.getSize());
	}
	
}
