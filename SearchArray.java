import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        int a[] = new int[50];
        int i, x, j = 0;
        int flag = 0;
        try (Scanner k = new Scanner(System.in)) {
            for (i = 0; i < 10; i++) {
                System.out.print("Enter a value: ");
                a[i] = k.nextInt();
            }
            System.out.print("Enter number you want to search: ");
            x = k.nextInt();
            for (int u : a) {
                if (u == x) {
                    flag++;
                    break;
                }
                j++;
            }
            if (flag != 0) {
                System.out.println("Element found at index " + j);
            } else {
                System.out.println("Element not found in array");
            }
            k.close();
        }
    }
}
