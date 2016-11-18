package edu.pragmatic.strings;

public class Demo {

	public static void main(String[] args) {
		
		String list = "Amstel,Becks,Tuborg,Zagorka";
		String [] beers = list.split(",");
		for(String beer : beers){
			System.out.println(beer);
		}
		
		Object r = new Rectangle(10, 20);
		System.out.println(r);
		
	}
	
}
