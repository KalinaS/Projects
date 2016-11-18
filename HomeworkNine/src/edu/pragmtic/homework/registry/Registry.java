package edu.pragmtic.homework.registry;

import java.util.*;

public class Registry<T> {

	String name;
	int maxSize;
	Set<T> s = new HashSet<>();

	Registry(String name, int size){
		this.name = name;
		maxSize = size;
	}

	public void addElement(T element) throws SizeLimitReachedException {

		if(s.size() == maxSize){
			throw new SizeLimitReachedException();
		} else {
			s.add(element);
		}

	}

	public void removeElement(T element) {
		s.remove(element);
	}
	
	public Object[] getElements(){
		return s.toArray();
	}
	
	public int getSize(){
		return s.size();
	}

}
