import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a N : ");
		int n = sc.nextInt();
		
		int num = 1;

		for (int i=0; i<n; i++){
			System.out.print((num++)+" ");
		}
		sc.close();
	}
}