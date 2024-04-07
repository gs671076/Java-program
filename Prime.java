import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int i = 2, flag = 0;
        int x;
        Scanner d = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        x = d.nextInt();
        while (i <= x - 1) {
            if (x % i == 0) {
                flag++;
                break;
            }
            i++;
        }
        if (flag == 0 && x != 0 && x != 1) {
            System.out.println(x + " is a prime number");
        } else
            System.out.println(x + " is not a prime number");
        d.close();
    }
}