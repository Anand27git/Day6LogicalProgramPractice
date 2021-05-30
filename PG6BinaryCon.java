import java.util.Scanner;

public class PG6BinaryCon {

	static void printBinary(int[] binary, int id)
    {
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }
  
    // Function converting decimal to binary
    public static void decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
  
        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
  
        // Print Binary
        printBinary(binary, id);
    }
  
    // Main Driver Code
    public static void main(String[] args)
    {
        // Entered number to be convert into binary
        int num;
        System.out.println("Enter the Number you want to covert");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
  
        // Calling Our Above Function
        decimalToBinary(num);
    }
	

	

}
