package edu.pragmatic.homeworkTen.concatenation;

public class NumbersConcatenation {
	
	int number;
	NumbersConcatenation(int number){
		this.number = number;
	}
	
	public String concatSlow(){
		String result = "";
		
		for(int i = 1; i <= number; i++){
			result += i;
		}
		
		return result;
	}
	
	public String concatFast(){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= number; i++){
			sb.append(i);
		}
		
		return sb.toString();
	}
	
}
