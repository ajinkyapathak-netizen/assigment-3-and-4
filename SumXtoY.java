import java.util.Scanner;

public class SumXtoY {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter initial value (X) : ");
		int x = sc.nextInt();

		System.out.println("Enter end value (Y) : ");
		int y = sc.nextInt();

		int sum = 0;		

		for (int i=x; i<=y; i++){
			sum = sum + i;
		}
		System.out.print("sum is "+sum);
	}
}