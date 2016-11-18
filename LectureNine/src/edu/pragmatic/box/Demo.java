package edu.pragmatic.box;

public class Demo {

	public static void main(String[] args) {
		
		/*
		Box b = new Box();
		
		b.setObject(new String("test"));
		b.setObject(new Integer(3));
		
		((String)b.getObject()).length(); //b.getObject --> object => cast to String
		
		System.out.println("Length is: " + ((String)b.getObject()).length());
		*/
		
		Box<String> b = new Box<String>();
		b.setObject(new String("test"));
		b.getObject().length();
		
		Box<Integer> b2 = new Box<>();
		b2.setObject(new Integer(3));
		b2.getObject().intValue();
		f(b2);
		
		Pair<Integer, Integer> p1 = new Pair<>();
		p1.first = 3; // = new Integer(3)
		p1.second = 4; // = new Integer(4)
		
		Pair<String, Integer> p2 = new Pair<>();
		p2.first = "5555";
		p2.second = new Integer(3);
		
		Pair<Pair<Integer, String>, String> p3 = new Pair<>();
		p3.first.second = "test";
		
		
	}
	
	static void f(Box<? extends Number> b){
		System.out.println(b.getObject().doubleValue());
	}
	
}
