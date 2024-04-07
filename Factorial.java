import java.util.Scanner;

class Fact {
    int fact(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }
}

class Factorial {
    public static void main(String[] args) {
        Fact f1 = new Fact();
        int n;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        n = k.nextInt();
        int x = f1.fact(n);
        System.out.println("Factorial of " + n + ": " + x);
    }
}