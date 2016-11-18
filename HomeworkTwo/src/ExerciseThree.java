import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		int i = firstNumber - 1;
		
		while(i >= firstNumber - 1  && i < secondNumber) {
			i++;
			System.out.println(i);
		}
		
	}
	
}
