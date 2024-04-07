class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Test t1 = new Test(100, 200);
        Test t2 = new Test(100, 200);
        Test t3 = new Test(-1, -1);
        Test t4 = new Test(100, 300);
        System.out.println("t1==t2: " + t1.equalTo(t2));
        System.out.println("t1==t3: " + t1.equalTo(t3));
        System.out.println("t1==t4: " + t1.equalTo(t4));
    }
}