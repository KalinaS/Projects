package edu.pragmtic.homework.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	Map<String, String> words = new HashMap<String, String>();
	
	public void addWord(String word, String translation){
		
		words.put(word, translation);
		
	}
	
	public String findWord(String word){
		
		return words.get(word);
	}
	
}
