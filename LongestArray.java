import java.util.Scanner;

public class LongestArray {
    public static void main(String[] args) {
        int a[] = new int[50];
        int i, x;
        Scanner k = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Enter a value: ");
            a[i] = k.nextInt();
        }
        x = a[0];
        for (int u : a) {
            if (u > x) {
                x = u;
            }
        }
        System.out.println(x + " is the largest Element in array");
        k.close();
    }
}
