import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any number: ");
        a = k.nextInt();
        System.out.print("Enter any number: ");
        b = k.nextInt();
        System.out.println("Before Swapping Value of a= " + a + " & b= " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Value of a= " + a + " & b= " + b);
        k.close();
    }
}
