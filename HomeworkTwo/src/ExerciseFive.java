import java.util.Scanner;

public class ExerciseFive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		for(int i = 3; i <= n; i++) {
			
			if(i % 3 == 0){
				System.out.print(i + ", ");
			}
			
		}
	}
	
}
