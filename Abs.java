abstract class Demo1
{
Demo1()
{
System.out.println("Parent class Constructor invoked.");
}
abstract void f1();
}
class Demo2 extends Demo1
{
Demo2()
{
System.out.println("Child class Constructor invoked.");
}
void f1()
{
}
}
class Abs
{
public static  void main(String args[])
{
Demo2 d1=new Demo2();

}
}