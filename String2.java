import java.util.Scanner;

class String2 {
    public static void main(String args[]) {
        String s2;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any String: ");
        s2 = k.nextLine();
        int length1 = s2.length();
        System.out.println("Length of String is: " + length1);
    }
}