import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a value: ");
            a[i] = k.nextInt();
        }
        int max, min;
        max = min = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Max number in array: " + max);
        System.out.println("Min number in array: " + min);
    }
}
