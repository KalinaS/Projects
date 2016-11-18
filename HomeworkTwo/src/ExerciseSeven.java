
import java.util.Random;
import java.util.Scanner;

public class ExerciseSeven {

	public static void main(String[] args) {
		
		Random randomNum = new Random();
		int number = randomNum.nextInt(20) + 1;
		System.out.println("Random number is: " + number);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number(1-20): ");
		
		int count = 1;		
		
		while (count <= 3){
			int userGuess = input.nextInt();
			
			if(userGuess == number){
				System.out.println("You Win!");
				break;
			} else {
				if(count == 3) {
					System.out.println("Game over");
				} else if(userGuess < number) {
					System.out.print("The wanted number is bigger. Please, enter another one: ");
				} else if(userGuess > number){
					System.out.println("Wanted number is smaller. Please, enter another one: ");
				}
			}
			
			count++;
			
			//if(count == 3){
			///	break;
			//}
		}
		
		
	}
	
}
