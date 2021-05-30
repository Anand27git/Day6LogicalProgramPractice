import java.util.Scanner;

public class PG5Sqareroot {

	public static void main(String[] args) {
		System.out.println("Enter the  two Numbers");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double l = sc.nextDouble();

		System.out.println(squareRoot(n, l));
	}

	// Function to return the square root 
	static double squareRoot(double n, double l) {
	
		double x = n;

		double root;

		int count = 0;

		while (true) {
			count++;
			root = 0.5 * (x + (n / x));
			if (Math.abs(root - x) < l)
				break;
			x = root;
		}

		return root;
	}

}
