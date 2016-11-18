package edu.pragmatic.lecture6;

public class Rectangle {

	private double width;
	private double height;

	Rectangle() {
		resize(0);

	}

	Rectangle(double width, double height) {
		resize(width, height);
	}

	Rectangle(double length) {
		// this.width = length;
		// this.height = length;

		// resize(length);

		this(length, length); // this constructor
	}
	
	/*public void setWidth(double width){
		if(width > 0){
			this.width = width;
		}
	}*/
	
	public double getWidth(){
		return width;
	}
	
	/*public void setHeight(double height){
		this.height = height;
	} */
	
	public double getHeight(){
		return height;
	}

	public double calculateArea() {
		double area = width * height;

		return area;
	}

	private void resize(double width, double height) {

		/*
		 * if( width < 0 || height <0) { return; }
		 */

		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		}

	}

	private void resize(double length) {

		this.width = length;
		this.height = length;
	}

	void printInfo() {

		System.out.println("width = " + width);
		System.out.println("height = " + height);

	}

}
