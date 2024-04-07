import java.util.Scanner;

class Compare {
    public static void main(String args[]) {
        String s1, s2;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any string: ");
        s1 = k.nextLine();
        System.out.print("Enter any string: ");
        s2 = k.nextLine();
        char c1[] = new char[50];
        char c2[] = new char[50];
        c1 = s1.toCharArray();
        c2 = s2.toCharArray();
        int flag = 0;
        for (int i = 0, j = 0; i < c1.length || j < c2.length; i++, j++) {
            if (c1[i] != c2[j]) {
                flag++;
                break;
            }

        }
        if (flag == 0)
            System.out.println("String are  equal");
        else
            System.out.println("String are not equal");

    }
}