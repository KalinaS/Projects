package edu.pragmatic.exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws MyException{
		
		System.out.println("main - 1");
		System.out.println("main - 2");
		
		
		try{
			f();
		} catch(ArithmeticException e) {
			System.err.println("divide by zero");
		} finally{
			System.out.println("in finally block");
		}
		
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			Utils u = new Utils();
			u.divide(a, b);
			//Automatically calls close();
		} 
		
		System.out.println("end");
		
	}
	
	public static void f() throws MyException{
		System.out.println("f - 1");
		System.out.println("f - 2");
		
		Utils  u = new Utils();
		u.divideTwo(3, 0);
		
		System.out.println("f - 2: ");
	}
	
}
