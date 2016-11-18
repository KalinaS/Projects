import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		a[3] = 5;
		System.out.println(a[3]);
		
		int[] b = {-2, 5, 10, -7};
		
		int elementsCount = 5;
		int[] numbers = new int[elementsCount];
		for(int i = 0; i < elementsCount; i++){
			System.out.println("Enter number " + i + ": ");
			numbers[i] = input.nextInt();
		}
		
		for(int i = 4; i >= 0; i--){
			System.out.print(numbers[i]);
		}
		
		for(int j = 0; j < elementsCount; j++){
			System.out.print(numbers[j]);
		}
		
		for(int i : numbers){
			System.out.print(i);
		}
	}
}
