class Student {
    private int roll;
    private float per;
    private int marks;

    void setData() {
        roll = 1619;
        per = 72;
        marks = 365;
    }

    void display() {
        System.out.println(roll);
        System.out.println(per);
        System.out.println(marks);
    }
}

class StudentCheck {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        s1.setData();
        s1.display();
    }
}
