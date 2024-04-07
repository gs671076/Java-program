import java.util.Scanner;

class GCD {
    public static void main(String args[]) {
        int a, b, temp, r;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any value: ");
        a = k.nextInt();
        System.out.print("Enter any value: ");
        b = k.nextInt();
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            r = a % b;
            if (r == 0) {
                break;
            }
            a = b;
            b = r;
        }
        System.out.println("GCD of two number: " + b);
    }
}