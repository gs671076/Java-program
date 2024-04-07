import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i, sum = 0;
        Scanner k = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Enter value: ");
            a[i] = k.nextInt();
        }
        for (int x : a) {
            sum += x;
        }
        int avg = sum / i;
        System.out.println("Average of number: " + avg);
    }
}
