import java.util.Scanner;

class ShiftZero {
    public static void main(String args[]) {
        int a[] = new int[10];
        int temp;
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a value: ");
            a[i] = k.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] == 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int x : a) {
            System.out.print(" " + x);
        }
    }
}