import java.util.Scanner;

public class AlarmTime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter if it is weekend: ");
		boolean isWeekend = input.nextBoolean();

		/*
		 * int day = 6; int alarmTime = (day == 6 || day == 7) ? 10 : 8;
		 */

		/*
		 * int alarmTime; if (isWeekend) { 
		 * 		alarmTime = 10; 
		 * } else {
		 * 		 alarmTime = 8; }
		 */

		int alarmTime = isWeekend ? 10 : 8; // if true => 10, if false => 8

		System.out.println("Alarm is set to: " + alarmTime);
		
		boolean isValid = false;
		int day = 0;
		while(!isValid){
			System.out.println("Enter day number (1-7): ");
			day = input.nextInt();
			
			if(day >= 1 && day <= 7){
				isValid = true;
			}
		}
		
		switch(day){  //input the variable we want to check - int, string, enum 
		case 7: 
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Thirsday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default: 
			System.out.println("Ivalid day");
			break;
		}
		}
	}


