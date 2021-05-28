import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// declaring the variables
		int n1 = 0, n2 = 1, i, count;
		System.out.println("enter the fibonacci limit");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();

		System.out.print(n1 + " " + n2);
		// loop starts from 2 because 0 and 1 are already printed
		for (i = 2; i < count; ++i) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
