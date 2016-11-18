import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an hour: ");
		int hour = input.nextInt();
		
		System.out.print("Enter money: ");
		double money = input.nextDouble();
		
		System.out.print("Are you healthy?(true or false): ");
		boolean health = input.nextBoolean();
		
		if(health == true){
			System.out.println("I am not going out.");
			
			if(money > 0){
				System.out.println("I will bye medicaments.");
			} else {
				System.out.println("I will stay at home and drink tea.");
			}
		} else {
			if (money >= 1 && money < 10){
				System.out.println("I will grab a coffee.");
			} else if(money > 10){
				System.out.println("Party all night.");
			} else {
				System.out.println("I will stay at home and play games.");
			}
		}
	}
	
}
