import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		//declaring the variables
		int i, num, m = 0, temp = 0;
		System.out.println("enter the number!!");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					temp = 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.println(num + " is prime Number");
			}
		}
	}
}
