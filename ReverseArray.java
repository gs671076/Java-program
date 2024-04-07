import java.util.Scanner;

class ReverseArray {
    public static void main(String args[]) {
        int a[] = new int[100];
        int b[] = new int[100];
        int n, i, j;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter number of element you want to store: ");
        n = k.nextInt();
        System.out.println("Enter the elemnt in array");
        for (i = 0; i < n; i++) {
            System.out.print("Enter a value: ");
            a[i] = k.nextInt();
        }
        System.out.println(" Original Array ");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        for (i = 0, j = n - 1; i < n; i++) {
            b[i] = a[j];
            j--;
        }
        System.out.println(" \nReversed Array ");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + b[i]);
        }
    }
}