import java.util.Scanner;

public class PG2DaysWeeks {

	public static void main(String[] args) {
		// declaring the variables as day month and year
		int day, month, year;
		// taking input from the user and assigning the value to the variables
		System.out.println("Enter a Date Month and Year");
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		// Performing the equations to get days of week
		int y = year - (14 - month) / 12;
		int x = y + (y / 4) - (y / 100) + (y / 400);
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;

		String temp[] = { "Sunday", "monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println(temp[d]);

	}

}
