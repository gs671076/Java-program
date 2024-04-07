import java.util.Scanner;

class UpperCase1 {
    public static void main(String args[]) {
        String str;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter String: ");
        str = k.nextLine();
        char s[] = new char[50];
        s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i] = (char) ((int) (s[i]) - 32);
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}