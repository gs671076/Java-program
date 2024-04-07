import java.util.Scanner;

class InsertArray1 {
    void insert(int b[], int n, int pos, int item) {
        int j = n;
        while (pos <= j) {
            b[j + 1] = b[j];
            j--;
        }
        b[pos] = item;
    }

    void display(int c[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + c[i]);
        }
    }
}

class InsertArray {
    public static void main(String args[]) {
        int a[] = new int[50];
        int pos, item;
        int n;
        InsertArray1 i1 = new InsertArray1();
        Scanner k = new Scanner(System.in);
        System.out.print("how many element you want to enter in array: ");
        n = k.nextInt();
        System.out.println("Enter the elemnt in array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a element: ");
            a[i] = k.nextInt();
        }
        System.out.println("Array Before insertion");
        i1.display(a, n);
        System.out.print("\nElement you want to insert: ");
        item = k.nextInt();
        System.out.print("Position at which you want to insert: ");
        pos = k.nextInt();
        i1.insert(a, n, pos, item);
        n++;
        System.out.println("Array after insertion");
        i1.display(a, n);
    }
}