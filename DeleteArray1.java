import java.util.Scanner;

class DeleteArray {
    void delete(int b[], int n, int pos, int item) {
        int a = item;
        int j = pos;
        while (j <= n - 1) {
            b[j] = b[j + 1];
            j++;
        }
    }

    void display(int c[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + c[i]);
        }
    }
}

class DeleteArray1 {
    public static void main(String args[]) {
        DeleteArray da1 = new DeleteArray();
        int a[] = new int[50];
        int pos, item;
        int n;
        Scanner k = new Scanner(System.in);
        System.out.print("how many element you want to enter in array: ");
        n = k.nextInt();
        System.out.println("Enter the elemnt in array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a element: ");
            a[i] = k.nextInt();
        }
        System.out.println("Array Before deletion");
        da1.display(a, n);
        System.out.print("\nElement you want to delete: ");
        item = k.nextInt();
        System.out.print("Position at which you want to delete: ");
        pos = k.nextInt();
        da1.delete(a, n, pos, item);
        n--;
        System.out.println("Array after Deletetion");
        da1.display(a, n);
    }
}