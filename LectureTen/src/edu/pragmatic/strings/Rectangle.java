package edu.pragmatic.strings;

public class Rectangle {

	double width;
	double height;
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}
	
	
	@Override
	public String toString(){
		return "This is retangle(" + getWidth() + ", " + getHeight() + ")";
	}
	
}
