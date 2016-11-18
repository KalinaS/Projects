
public class Loops {

	public static void main(String[] args) {
		
		System.out.println("With while loop: ");
		int i = 0;
		while(i < 100){
			i++;
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("With do-while loop: ");
		i = 0;
		do {
			i++;
			System.out.print(i);
		} while (i < 100);
		
		System.out.println();
		System.out.println("With for loop: ");
		boolean shouldContinue = true;
		for(int k = 1; k <= 100; k++ ){
			
			if(k > 50){
				break;
			}
			
			System.out.print(k);
		}
		
		for(int k = 1; k <= 100; k++){
			
		/*	if(k < 50 || k >60){
				System.out.println(k);
			} */
			
			if( k >= 50 && k <=60){
				continue;
			}
		}
		
		
//sum from 1 to 100
		int sum = 0;
		for(int j = 1; j <= 100; j++){
			sum += j;
		}
		
	}
	
}
