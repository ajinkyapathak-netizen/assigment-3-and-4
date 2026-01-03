import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a N : ");
		int n = sc.nextInt();

		for (int i=0; i<n; i++){
			System.out.println("Hello");
		}
		sc.close();
	}
}