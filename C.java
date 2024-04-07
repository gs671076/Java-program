class A
{
int x,y;
A()
{
System.out.println("Parent class Constructor invoked.");
}
void setData(int x, int y)
{
this.x=x;
this.y=y;
}
void d2()
{
System.out.println("x: "+x+" y: "+y);
}
}
class B extends A
{
int z;
B()
{
System.out.println("Child class Constructor invoked.");
}
void f2(int z)
{
this.z=z;
}
void d1()
{
System.out.println("z: "+z);
}
}
class C
{
public static void main(String args[])
{
B k=new B();
k.setData(2,3);
k.d2();
k.f2(6);
k.d1();
}
}