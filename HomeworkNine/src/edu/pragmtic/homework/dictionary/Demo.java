package edu.pragmtic.homework.dictionary;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Dictionary d = new Dictionary();

		while (true) {
			System.out.println();
			System.out.println("-----MENU-----");
			System.out.println("1. Enter word");
			System.out.println("2. Find a word");
			System.out.println("3. Exit.");

			System.out.print("Choose an option: ");
			int i = input.nextInt();

			String word;
			String translation = null;

			if (i == 1) {
				System.out.print("Enter a word: ");
				word = input.next();
				System.out.print("Enter a translation: ");
				translation = input.next();
				d.addWord(word, translation);
			} else if (i == 2) {
				System.out.print("Please enter a word: ");
				word = input.next();
				if(d.findWord(word) == null){
					System.out.println("This word does not exist.");
				} else {
				System.out.println(d.findWord(word));
				}
			} else {
				System.out.println("Thank you for using our Dictionary.");
				break;
			}
		}

	}

}
