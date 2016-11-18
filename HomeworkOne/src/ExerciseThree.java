import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numberOne = input.nextInt();
		System.out.print("Enter second number: ");
		int numberTwo = input.nextInt();
		int result = numberOne*numberTwo;
		System.out.println("Result: " + result);
		
		if (result > 0){
			System.out.println("Number is positive.");
		} else {
			System.out.println("Number is negative.");
		}
	}
	
}
