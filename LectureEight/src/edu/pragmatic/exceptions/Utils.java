package edu.pragmatic.exceptions;

public class Utils {

	public int divide(int a, int b){
		System.out.println("divide - 1");
		int result = a/b;
		System.out.println("divide - 2");
		return a/b;
	}
	
	public int divideTwo(int a, int b) throws MyException{
		if(b == 0){
			throw new MyException();
		}
		
		return a/b;
	}
	
}
