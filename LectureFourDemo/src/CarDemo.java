
public class CarDemo {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.currentGear = 4;
		c.owner = new Person();
		c.owner.age = 5;
		System.out.println(c.owner.age);
		System.out.println(c.color);
		
	}
	
}
