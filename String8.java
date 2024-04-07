import java.util.Scanner;

class String8 {
    public static void main(String args[]) {
        String s2;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any String: ");
        s2 = k.nextLine();
        System.out.println("String: " + s2);
        String s3 = s2.substring(1);
        System.out.println("SubString: " + s3);
    }
}