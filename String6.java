import java.util.Scanner;

class String6 {
    public static void main(String args[]) {
        String s2, s3, s4, s5;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any String: ");
        s2 = k.nextLine();
        System.out.print("Enter any String: ");
        s3 = k.nextLine();
        System.out.println(" String in Uppercase");
        s4 = s2.toUpperCase();
        System.out.println("String: " + s4);
        System.out.println(" String in Lowercase");
        s5 = s3.toLowerCase();
        System.out.println("String: " + s5);

    }
}