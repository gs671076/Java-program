import java.util.Scanner;

class String5 {
    public static void main(String args[]) {
        String s2, s3, s4;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any String: ");
        s2 = k.nextLine();
        System.out.print("Enter any String: ");
        s3 = k.nextLine();
        System.out.println("Both String After concatenation");
        s4 = s2.concat(s3);
        System.out.println("String: " + s4);

    }
}