class Super1
{
int i;
}
class Super2 extends Super1
{
int i;
Super2(int a, int b)
{
super.i=a;
i=b;
}
void show()
{
System.out.println("i in SuperClass: "+super.i);
System.out.println("i in child class:  "+i);
}
}
class  Super3
{
public static void main(String args[])
{
Super2 s1=new Super2(11,3);
s1.show();
}
}