import java.util.Scanner;

class LinearSearch {
    void lSearch(int b[], int n, int item) {
        int flag = 0, i;
        for (i = 0; i < n; i++) {
            if (b[i] == item) {
                flag++;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(item + " is found at index " + i);
        } else {
            System.out.println(item + " is not found in array.");
        }
    }
}

class Lsearch {
    public static void main(String args[]) {
        int a[] = new int[50];
        int n, item;
        LinearSearch l1 = new LinearSearch();
        Scanner k = new Scanner(System.in);
        System.out.print("how many element you want to enter in array: ");
        n = k.nextInt();
        System.out.println("Enter the elemnt in array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a element: ");
            a[i] = k.nextInt();
        }
        System.out.print("Enter the elemnt you want to search in array: ");
        item = k.nextInt();
        l1.lSearch(a, n, item);
    }
}