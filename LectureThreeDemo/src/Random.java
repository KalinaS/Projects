import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		do {
			int firstNumber = r.nextInt(10) + 1;
			int secondNumber = r.nextInt(10) + 1;
			
			int result = (firstNumber * secondNumber);
			
			System.out.println(firstNumber + " * " + secondNumber + " = ");
			int userGuess = input.nextInt();
			
			if(userGuess == result){
				System.out.println("You are correct.");
			} else {
				System.out.println("You are wrong. The result is: " + result);
			} 
			System.out.println("Do you want to continue:(1 for yes/ 0 for no)");
			int choise = input.nextInt();
			
			if(choise == 0){
				break;
			}
		} while(true);
	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
