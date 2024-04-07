import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        int real1, real2, img1, img2;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter real value: ");
        real1 = k.nextInt();
        System.out.print("Enter real value: ");
        real2 = k.nextInt();
        System.out.print("Enter imaginary value: ");
        img1 = k.nextInt();
        System.out.print("Enter imaginary value: ");
        img2 = k.nextInt();
        int r = real1 + real2;
        int i = img1 + img2;
        System.out.println("Sum of complex number=" + r + "+" + i + "i");
        k.close();
    }
}
