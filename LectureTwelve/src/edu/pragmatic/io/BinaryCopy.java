package edu.pragmatic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BinaryCopy {

	public static void main(String[] args) {
		
		try(FileInputStream inputStream = new FileInputStream("res/t.txt");
			FileOutputStream outputStream = new FileOutputStream("res/copy.txt");) {
			while(true){
				int b = inputStream.read();
				if(b == -1){
					break;
				}
				
				outputStream.write(b);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist.");
			e.printStackTrace();
		} catch(IOException e ){
			System.err.println("IOException has occured.");
		}
		
	}
	
}
