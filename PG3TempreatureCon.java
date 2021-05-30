import java.util.Scanner;

public class PG3TempreatureCon {

	public static void main(String[] args) {
		int choice;
		System.out.println("enter your choice to convert 1.Celsius: 2.Fahrenheit:");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		// conversion of temperature Fahrenheit into Celsius
		if (choice == 1) {
			System.out.println("Enter the temperature in Fahrenheit:");
			int fahrenheit = sc.nextInt();
			int celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("The Temperature in Celsius is :" + celsius);
			// conversion of temperature Celsius into Fahrenheit
		} else if (choice == 2) {
			System.out.println("Enter the Temperature in Celsius:");
			int celsius = sc.nextInt();
			int fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("The Temperature in Celsius is :" + fahrenheit);
		} else {
			System.out.println("you have entered invaild choice please enter valid choice");
		}
	}
}
