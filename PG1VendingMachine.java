import java.util.Scanner;

public class PG1VendingMachine {

	public static void main(String[] args) {
		int rupees;
		System.out.println("Enter amount that you want to change");
		Scanner sc = new Scanner(System.in);
		rupees = sc.nextInt();
		countCurrency(rupees);
	}

	public static void countCurrency(int rupees) {
		int[] notes = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int[] noteCounter = new int[8];
		for (int i = 0; i < 8; i++) {
			if (rupees >= notes[i]) {
				noteCounter[i] = rupees / notes[i];
				rupees = rupees - noteCounter[i] * notes[i];
			}
		}
		System.out.println("currency notes Count is :-");
		for (int i = 0; i < 8; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + ":" + noteCounter[i]);
			}
		}

	}

}
