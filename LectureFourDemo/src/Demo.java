
public class Demo {

	public static void main(String[] args) {
		
	Person p1 =	new Person();
	Person p2 = p1;
	p1.age = 20;
	System.out.println(p1.age);
	System.out.println(p1.name);
	System.out.println(p2.age);
	
	Person p3 = new Person();
	p2 = p3;
	System.out.println(p2.age);
	p1 = p2;
	System.out.println(p1.age);
	
	}
	
}
