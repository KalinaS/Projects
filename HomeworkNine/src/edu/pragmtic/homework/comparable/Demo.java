package edu.pragmtic.homework.comparable;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Tree[] trees = new Tree[]{
			new Tree(2), new Tree(7), new Tree(1), new Tree(19), new Tree(6), new Tree(13)	
		};
		
		List<Tree> treeColl = new ArrayList<>();
		for(Tree element : trees){
			treeColl.add(element);
		}
		
		List<Person> personColl = new ArrayList<>();
		personColl.add(new Person(3));
		personColl.add(new Person(7));
		personColl.add(new Person(11));
		personColl.add(new Person(20));
		
		Person oldestPerson = Demo.maxElement(personColl);
		System.out.println(oldestPerson);
		
		Tree maxElement = Demo.maxElement(treeColl);
		System.out.println(maxElement);
		
		
	}
	
	public static <T extends Comparable<T>> T maxElement(List<T> elements){
		
		T maxElement = elements.get(0);
		
		for(int i = 0; i < elements.size(); i++){
			
			T el = elements.get(i);
			if(el.compareTo(maxElement) > 0){
				maxElement = elements.get(i);
			}
		}
		
		return maxElement;
		
	}
	
}
