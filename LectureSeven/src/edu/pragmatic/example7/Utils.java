package edu.pragmatic.example7;

public class Utils {

	public static Object findMinElement(Object[] objects, Comparator c){
		
		if(objects == null || objects.length == 0){
			return null;
		}
		
		Object min = objects[0];
		for(int i = 1; i <= objects.length; i++){
			if(c.compare(min, objects[i]) == 1){
				min = objects[i]
			}
		}
		
		return min;
	}
	
}

//0 if they are equal
//-1 if min < object[i]
//1 if min > object[i]