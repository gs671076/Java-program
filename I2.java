interface I1
{
int x=2;
void f1();

}
class I2 implements I1
{
public void f1()
{
System.out.println("Hello");
}
public static void main(String args[])
{
I2 i=new I2();
i.f1();
System.out.println("x"+ I1.x);

}
}