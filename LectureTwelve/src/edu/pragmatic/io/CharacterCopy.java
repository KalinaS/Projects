package edu.pragmatic.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCopy {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("res/t.txt");
			 FileWriter writer = new FileWriter("res/copy.txt");	){
			
			while(true){
				int ch = reader.read();
				if(ch == -1){
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException has occured.");
			e.printStackTrace();
		} catch(IOException e){
			System.err.println("IOException has occured.");
		}
		
		
	}
	
}
