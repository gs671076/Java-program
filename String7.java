import java.util.Scanner;

class String7 {
    public static void main(String args[]) {
        String s2;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any String: ");
        s2 = k.nextLine();
        System.out.println("String: " + s2);
        String s3 = s2.replace('a', 'o');
        System.out.println("REplaced String: " + s3);
    }
}