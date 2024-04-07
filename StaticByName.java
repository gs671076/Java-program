class StaticDemo {
    static int a = 42;
    static int b = 99;
 int c=33;

    static void callme() {
        System.out.println("a=" + a);
        //System.out.println("c=" +c);
    }
}

class StaticByName {
    public static void main(String args[]) {
        StaticDemo.callme();
        System.out.println("b=" + StaticDemo.b);
    }
}