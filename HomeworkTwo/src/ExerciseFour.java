import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int i = 1;
		int sum = 0;
		
		do {
			
			sum += i;
			i++;
			
		} while (i <= number);
		
		System.out.println("Result: " + sum);
		
	}
	
}
