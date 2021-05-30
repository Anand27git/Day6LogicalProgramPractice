import java.util.Scanner;

public class PG7BinarySwap {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number to conver into Binary");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int number = toBinary(n);
		System.out.println(+ number);
		int x = swapnibbles(n);
		System.out.println(+x);
	}

	public static int toBinary(int n) {
		if (n > 1) {
			toBinary(n / 2);
		}
		int number = n % 2;

		System.out.print(number);
		return number;
	}

	static int swapnibbles(int x) {
		int value = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
		return value;
	}
}
