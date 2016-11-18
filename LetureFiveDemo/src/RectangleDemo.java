import edu.pragmatic.example.Person;

public class RectangleDemo {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 5);

		//r.width = 10;
		//r.height = 5;

		double area = r.calculateArea();
		r.resize(20, 3);

		System.out.println(r.calculateArea());
		System.out.println(area);
		r.printInfo();

		Rectangle r2 = new Rectangle();
		double area2 = r2.calculateArea();
		
	//////////////////////////////////////////////
		
		Rectangle r3 = new Rectangle(23);		
		Painter painter = new Painter();
		painter.paint(r3);
		System.out.println(r3.width);
		
		Person p = new Person();
		
		//edu.pragmatic.example.Person p = new edu.pragmatic.example.Person();

	}

}
