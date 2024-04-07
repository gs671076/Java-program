import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        int a, sum = 0, n, count = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any value: ");
        n = a = k.nextInt();
        int a1 = a;
        while (a1 > 0) {
            count++;
            a1 /= 10;
        }
        while (a > 0) {
            int r = a % 10;
            sum = sum + (int) (Math.pow(r, count));
            a = a / 10;
        }
        System.out.println(sum + " sum");
        if (sum == n) {
            System.out.println(n + " is armstrong number");
        } else {
            System.out.println(n + " is not armstrong number");
        }
    }
}