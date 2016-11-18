package edu.pragmatic.classes;

public class Zoo {

	private Animal[] animals;
	
	public Zoo(){
		animals = new Animal[10];
	}
	
	public void showAllAnimals(){
		for(Animal animal : this.animals){
			if(animal != null){
				animal.printInfo();
			}
		}
	}
	
	public void addAnimal(Animal animal){
		for(int i = 0; i < animals.length; i++){
			if(animals[i] == null){
				animals[i] = animal;
				return;
			}
		}
		System.out.println("No free space.");
	}
}
