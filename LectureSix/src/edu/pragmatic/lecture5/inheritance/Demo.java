package edu.pragmatic.lecture5.inheritance;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student("st");
		s.age = 4;
		s.goToSchool();
		
		CoolStudent cs = new CoolStudent("cool st");
		cs.age = 10;
		cs.goToSchool();
		cs.haircutStyle = "Very Cool";
		
		Student s2 = new CoolStudent("cool st2");
		((CoolStudent)s2).haircutStyle = "sth";//cast s2 - take her as a refernce to CoolStudent type
		s2.goToSchool();
		s2 = s;
		if (s instanceof CoolStudent) {
			((CoolStudent)s2).haircutStyle = "sth";
		}
		s2.goToSchool();
		
	}
	
}
