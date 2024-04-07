import java.io.*;
class Overload1
{
int x,y;
void f1()
{
System.out.println("No Parameter1");
}
void f1(int x ,int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println("x: "+x+" y: "+y);
}
}
class OverloadDemo1
{
public static void main(String args[])
{
Overload1 o1=new Overload1();
o1.f1();
o1.f1(8,9);
o1.display();
}
}