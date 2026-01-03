import java.util.Scanner;

public class CircleAndSphere {

	public static void main(String[] args) {
		boolean value = false;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a radius of circle/sphere : ");
		int r = sc.nextInt();

		do {
			value = true;
			System.out.println();
			System.out.println();

			System.out.println("Menu :");
			System.out.println("1. Area of Circle : ");
			System.out.println("2. Circumference of Circle : ");
			System.out.println("3. Volume of Sphere : ");
			System.out.println("4. exit.");
	
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			switch(choice) {
				case 1 : double Area = 3.14 * r * r;
					 System.out.println("Area of Circle is : "+Area);
					 break;

				case 2 : double Circumference = 2 * 3.14 * r;
					 System.out.println("Circumference of Circle is : "+Circumference);
					 break;
				
				case 3 : double volume = 4 / 3 * 3.14 * r * r * r;
					 System.out.println("Volume of Sphere is : "+volume);
					 break;

				case 4 : System.out.println("Thank You !!");
					  value = false;
					 break;
			
				default : System.out.println("Choose valid option. !!");
			}

		} while(value);

	}

}