package Pack3;

class Add {
    int a;
    int b;
    int c;

    public void add(int a, int b) {
        this.a = a;
        this.b = b;
        c = a + b;
        System.out.println("Sum of two Number is: " + c);
    }

}

class Subtract extends Add {
    int a;
    int b;
    int c;

    public void subtract(int a, int b) {
        this.a = a;
        this.b = b;
        c = a - b;
        System.out.println("Difference of two Number is: " + c);
    }
}

class Multiply extends Subtract {
    int a;
    int b;
    int c;

    public void multiply(int a, int b) {
        this.a = a;
        this.b = b;
        c = a * b;
        System.out.println("Multiply of two Number is: " + c);
    }
}

public class Devide extends Multiply {
    int a;
    int b;
    int c;

    public void devide(int a, int b) {
        this.a = a;
        this.b = b;
        c = a / b;
        System.out.println("Divide of two Number is: " + c);
    }
}