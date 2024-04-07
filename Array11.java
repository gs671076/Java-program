import java.util.Scanner;

class Array11 {
    public static void main(String args[]) {
        int a[] = new int[10];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a value: ");
            a[i] = k.nextInt();
        }
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.print("Enter a value found occurrence in array: ");
        int n = k.nextInt();
        int count = 0;
        for (int x : a) {
            if (x == n) {
                count++;
            }
        }
        System.out.println(n + " comes " + count + " times.");
    }
}