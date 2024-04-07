import java.util.Scanner;

class DuplicateArray {
    public static void main(String args[]) {
        int a[] = new int[50];
        int n;
        Scanner k = new Scanner(System.in);
        System.out.print("How many element want to enter in an array: ");
        n = k.nextInt();
        System.out.println("Enter the value in array.");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            a[i] = k.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int w = j; w < n; w++) {
                        a[w] = a[w + 1];
                    }
                    j--;
                    n--;
                }
            }
        }
        System.out.println("\nArray after removing duplicate value");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
    }
}