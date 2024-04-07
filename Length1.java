import java.util.Scanner;

class Length1 {
    public static void main(String args[]) {
        String str;
        int x = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter String: ");
        str = k.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            x++;
        }
        System.out.println("length of String: " + x+" "+ch.length);
    }
}