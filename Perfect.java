import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// declaring the variable
		int i, Num, Res = 0;
		System.out.println("enter the Number!!");
		Scanner sc = new Scanner(System.in);
		Num = sc.nextInt();
		for (i = 1; i < Num; i++) {
			if (Num % i == 0) {
				Res = Res + i;
			}
		}
		//checking with if condition
		if (Res == Num) {
			System.out.format(+Num + ": is a Perfect Number!!");
		} else {
			System.out.format(+Num + ": it is NOT a Perfect Number!!");
		}
	}
}
