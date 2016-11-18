package edu.pragmatic.classes;

public class Demo {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Bird());
		zoo.addAnimal(new Bird());
		zoo.addAnimal(new Fish());
		zoo.addAnimal(new Dog());
		
		zoo.showAllAnimals();
		
		Animal bird = new Bird();
		if(bird instanceof Bird){
			((Bird)bird).fly();
		}

	}
	
}
