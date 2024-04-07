class Test1 {
    static int x;

    void func1() {
        x = 22;
    }

    void func2() {
        System.out.println("x is " + x);
    }

    void func3() {
        x = 45;
    }
}

class TestStatic {
    public static void main(String args[]) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t2.func2();
        t2.func1();
        t1.func2();
        t1.func3();
        t2.func2();
    }
}