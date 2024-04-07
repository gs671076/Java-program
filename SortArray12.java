import java.util.Scanner;

class SortArray1 {
    void sort(int b[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
    }

    void display(int c[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + c[i]);
        }
    }
}

class SortArray12 {
    public static void main(String args[]) {
        int a[] = new int[50];
        int n;
        SortArray1 i1 = new SortArray1();
        Scanner k = new Scanner(System.in);
        System.out.print("how many element you want to enter in array: ");
        n = k.nextInt();
        System.out.println("Enter the elemnt in array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a element: ");
            a[i] = k.nextInt();
        }
        System.out.println("\n Array Before Sorting");
        i1.display(a, n);
        i1.sort(a, n);
        System.out.println("Array after Sorting");
        i1.display(a, n);
    }
}