import java.util.Scanner;

class NoteCounting {
    public static void main(String args[]) {
        int amount;
        int r = 0;
        int r2 = 0;
        int r3 = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = k.nextInt();
        if (amount % 100 == 0) {
            {
                if (amount >= 2000) {
                    r = amount / 2000;
                    amount = amount % 2000;
                }
                if (amount >= 500) {
                    r2 = amount / 500;
                    amount = amount % 500;
                }
                if (amount >= 100) {
                    r3 = amount / 100;
                    amount = amount % 100;
                }
            }
            System.out.print(" Notes of 2000: " + r + " Notes of 500: " + r2 + " Notes of 100: " + r3);
        } else {
            System.out.print("Please enter amount in multiple of 100 ");
        }
    }
}