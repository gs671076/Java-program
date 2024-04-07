import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int nums;
        int sum = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the integer till you need sum: ");
        nums = k.nextInt();
        while (nums > 0) {
            sum += nums;
            nums--;
        }
        System.out.println("Sum: " + sum);
        k.close();
    }
}
