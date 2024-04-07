import java.util.Scanner;

public class PalindromeN {
    public static void main(String[] args) {
        int nums, r, q;
        int sum = 0;
        Scanner b = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int nums2 = nums = b.nextInt();
        while (nums > 0) {
            r = nums % 10;
            sum = sum * 10 + r;
            q = nums / 10;
            nums = q;
        }
        if (nums2 == sum) {
            System.out.println(nums2 + " is Palindrome number");
        } else {
            System.out.println(nums2 + " is not Palindrome number");
            b.close();
        }
    }
}
