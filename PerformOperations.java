import java.util.Scanner;

public class PerformOperations {

	public static void main(String[] args){
		boolean body = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x and y values resp. : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		do {
			body = true;

			System.out.println();
			System.out.println();
			
			System.out.println("1. Check Equality.");
			System.out.println("2. Check greater or less.");
			System.out.println("3. Find Quotient and Remainder.");
			System.out.println("4. check range of given number.");
			System.out.println("5. Swap x and y.");
			System.out.println("6. Exit.");
			
			System.out.println();
	
			System.out.println("Enter you choice : ");
			int choice = sc.nextInt();
		
			switch(choice){

				case 1 : if(x==y){ 
						System.out.println("X and Y are Equals."); 
					} else {
						System.out.println("X and Y are not Equals.");
					}
					break;

				case 2 : if(x>y){
						System.out.println("X greater than Y.");
					 } else if (x<y) {
						System.out.println("X less than Y.");
					 } else {
						System.out.println("X and Y are Equals.");
					 }
					break;

				case 3 : int quotient = x / y;
						System.out.println("Quotient of X divided by Y is : "+quotient);
					 int remainder = x % y;
						System.out.println("Remainder of X divided by Y is : "+remainder);
					break;

				case 4 : System.out.println("Enter any number : ");
					  int num = sc.nextInt();
					if (x<num && y>num){
						System.out.println(num+" range is between X and Y.");
					} else if (x==num || y==num){
						System.out.println(num+" is a X or Y.");
					} else {
						System.out.println(num+" is out of X and Y range.");
					}
					break;

				case 5 : System.out.println("Swapping of X and Y is : ");
					 int temp = x;
						x = y;
						y = temp;
					  System.out.println("After swapping valu of X is "+x+" and "+" Y is "+y);
					break;

				case 6 : System.out.println ("thank you !!");
					body = false;
					break;

				default : System.out.println("Enter valid choice !!");
			}

		} while(body);

	}

}