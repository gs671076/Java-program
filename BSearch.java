import java.util.Scanner;

class BinarySearch {
    void sort(int a[], int n) {

        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    void bSearch(int a[], int item, int beg, int end) {
        int mid = (beg + end) / 2;
        int flag = 0;
        while (beg <= end) {
            if (a[mid] == item) {
                System.out.println(item + " is found at index " + mid);
                flag++;
                break;
            } else if (a[mid] < item) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (beg + end) / 2;
        }
        if (flag == 0) {
            System.out.println("Element is not found");
        }
    }
}

class BSearch {
    public static void main(String args[]) {
        BinarySearch b1 = new BinarySearch();
        int a[] = new int[50];
        int n, item;
        Scanner k = new Scanner(System.in);
        System.out.print("How many value want in array: ");
        n = k.nextInt();
        System.out.println("Enter a value in array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value: ");
            a[i] = k.nextInt();
        }
        b1.sort(a, n);
        System.out.println("Array after sorting ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n Element you want to searching array: ");
        item = k.nextInt();
        b1.bSearch(a, item, 0, n);
    }
}