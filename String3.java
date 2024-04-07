import java.util.Scanner;

class String3 {
    public static void main(String args[]) {
        String s2, s3;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any String: ");
        s2 = k.nextLine();
        System.out.print("Enter any String: ");
        s3 = k.nextLine();
        System.out.println("Both String Are equal?");
        if (s2.equals(s3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}