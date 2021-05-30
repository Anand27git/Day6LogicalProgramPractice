import java.util.Scanner;

public class PG4MonthPayment {

	public static void main(String[] args) {
		//declaring the variables P, rate and year
		double P, rate, year;
		System.out.println("Enter the Principle amount,Rate and Years");
		Scanner sc = new Scanner(System.in);
		P = sc.nextDouble();
		rate = sc.nextDouble();
		year = sc.nextDouble();

		double n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (P * r) / (1 - (Math.pow((1 + r), (-n))));
		System.out.println("The payment per month is:" + payment);

	}

}
