 class A111
{
void  callme()
{
System.out.println("A");
}
}
class B111 extends A111
{
void  callme()
{
System.out.println("B");
}
}
class C111
{
public static void main(String args[])
{
//A111 a2=new B111();
A111 a1=new  A111();
B111 b1=new B111();
a1=b1;
a1.callme();

}
}