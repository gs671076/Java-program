import PackA.*;
import PackB.*;
class PAImpl {
    public static void main(String args[]) {
        PackA.PA1 p = new PackA.PA1(20);
        PackA.PA1 p2 = new PackA.PA1(30);
        p.Display1();
        p2.Display1();
    }
}