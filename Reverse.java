import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// declaring variables
		int num, reversed = 0;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//checking with while condition
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed Number: " + reversed);
	}

}
