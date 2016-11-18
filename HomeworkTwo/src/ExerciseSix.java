import java.util.Scanner;

public class ExerciseSix {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numArray = new int[15];
		
		int maxNumber = numArray[0];
		int minNumber = numArray[0];
		
		for(int i = 0; i<numArray.length; i++){
			
			System.out.print("Enter a number: ");
			numArray[i] = input.nextInt();
		}
		
		for(int j = 1; j<numArray.length; j++){
			
			if(numArray[j] < minNumber){
				minNumber = numArray[j];
			}
			
			if(numArray[j] > maxNumber){
				maxNumber = numArray[j];
			}
			
		}
		
		System.out.println("The minimum value is: " + minNumber);
		System.out.println("The maximum value is: " + maxNumber);
		
	}
	
}
