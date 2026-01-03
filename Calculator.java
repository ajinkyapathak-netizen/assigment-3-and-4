import java.util.Scanner;

public class Calculator {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter operator(+,-,*,/) : ");
		char operator = sc.next().charAt(0);

		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		switch(operator){
			case '+' : int sum = num1 + num2;
				System.out.println(sum);
				break;
			
			case '*' : int mult = num1 * num2;
				System.out.println(mult);
				break;

			case '/' : int division = num1 / num2;
				System.out.println(division);
				break;

			case '-' : int diff = num1 - num2;
				System.out.println(diff);
				break;

			default : System.out.println("Select correct operator !!");
		}

	}

}