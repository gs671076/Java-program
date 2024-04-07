class MagicalNumber {
    public static void main(String args[]) {
        int i, r, q;
        int sum;
        for (i = 1; i <= 99; i++) {
            q = i;
            sum = 0;
            while (q > 0) {
                r = q % 10;
                sum = sum + r;
                q = q / 10;
                if (sum > 9) {
                    q = sum;
                    sum = 0;
                }
            }
            if (sum == 1) {
                System.out.println(i + " is a magical number.");
            } else {
                System.out.println(i + " is not a  magical number");
            }
        }
    }
}