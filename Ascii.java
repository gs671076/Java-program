import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ascii {
    public static void main(String args[]) throws IOException {
        int a;
        char c;
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any character: ");
        c = (char) d.read();
        a = (int) c;
        System.out.print("ASCii value of " + c + " is " + a);
    }
}