import java.util.Scanner;

class Sum {
  public static void main(String args[]) {

    int a, b, c;
    Scanner d = new Scanner(System.in);
    a = d.nextInt();
    b = d.nextInt();
    c = a + b;
    System.out.println("Sum of two number=" + c);
    d.close();
  }
}
