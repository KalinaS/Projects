package edu.pragmatic.homeworkTen.concatenation;

public class Demo {

	public static void main(String[] args) {
		
		NumbersConcatenation nc = new NumbersConcatenation(1000000);
		
		long start = System.currentTimeMillis();
		nc.concatSlow();
		long end = System.currentTimeMillis();
		long result = end - start;
		System.out.println(result);
		
		start = System.currentTimeMillis();
		nc.concatFast();
		end = System.currentTimeMillis();
		result = end - start;
		System.out.println(result);
	}
	
}
