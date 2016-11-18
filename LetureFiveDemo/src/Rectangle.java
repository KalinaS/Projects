
public class Rectangle {

	double width;
	double height;
	
	Rectangle() {
		resize(0, 0);
		
	}
	
	Rectangle(double width, double height){
		resize(width, height);
	}
	
	Rectangle(double length) {
		//this.width = length;
		//this.height = length;
		
		// resize(length);
		
		this(length, length); //this constructor
	}

	double calculateArea() {
		double area = width * height;

		return area;
	}

	void resize(double width, double height) {
		
		/* if( width < 0 || height <0) {
		 * 		return;
		 }
		 */

		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		}

	}
	
	void resize(double length) {
		
		this.width = length;
		this.height = length; 
	}
	
	void printInfo(){
		
		System.out.println("width = " + width);
		System.out.println("height = " + height);
		
	}

}
