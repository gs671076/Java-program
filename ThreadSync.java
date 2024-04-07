import java.util.Scanner;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    boolean isSufficient(int w) {
        if (bal >= w)
            return true;
        else
            return false;
    }

    void withdraw(int amt, String g1) {
        bal = bal - amt;
        System.out.println(g1 + " Transaction Successful.");
        System.out.println(g1 + " Current Balance is " + bal);
    }
}

class Customer implements Runnable {
    Account x1;
    String h1;

    Customer(Account j1, String s1) {
        x1 = j1;
        h1 = s1;
    }

    public void run() {
        synchronized (x1)

        {

            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter amount to be withdraw for" + h1);
            int amt = s1.nextInt();
            if (x1.isSufficient(amt)) {
                x1.withdraw(amt, h1);
            } else {
                System.out.println("Insufficient Balance.");
            }
        }
    }
}

class ThreadSync {
    public static void main(String args[]) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Amit" + ": ");
        Customer c2 = new Customer(a1, "Sumit" + ": ");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}