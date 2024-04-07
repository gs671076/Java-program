class Box1 {
    double width;
    double height;
    double depth;

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double lens) {
        width = height = depth = lens;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * width;
    }
}

class OverloadCons {
    public static void main(String args[])

    {
        Box1 b1 = new Box1();
        Box1 b2 = new Box1(20);
        Box1 b3 = new Box1(10, 20, 30);
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }
}