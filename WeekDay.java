import java.util.Scanner;

public class WeekDay {

public static void main(String[] args) {
	boolean value = false;
	Scanner sc = new Scanner(System.in);

	do {
		value = true;

		System.out.println();
		System.out.println();

		System.out.println("Enter a number to find day name (1 to 7) : ");
		int num = sc.nextInt();

		switch(num){
			case 1 : System.out.println("Sunday ");
				break;
			case 2 : System.out.println("Monday ");
				break;
			case 3 : System.out.println("Tuesday ");
				break;
			case 4 : System.out.println("Wednsday ");
				break;
			case 5 : System.out.println("Thursday ");
				break;
			case 6 : System.out.println("Friday ");
				break;
			case 7 : System.out.println("Saturday ");
				break;
			default : System.out.println("Choose correct number. !! ");
			}
		} while(value);

	}
}