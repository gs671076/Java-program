package Package2;
import Package1.*;
class G2 {
    public static void main(String args[]) {
        G1 g = new G1();
        g.setData(500, 600);
        g.display();
    }
}