import java.util.Scanner;

class String1 {
    public static void main(String args[]) {
        String s1;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any string: ");
        s1 = k.nextLine();
        char ch[] = new char[50];
        ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(" " + ch[i]);
        }
    }
}