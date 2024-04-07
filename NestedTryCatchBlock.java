public class NestedTryCatchBlock
{
public static void main(String args[])
{
try
{
System.out.println("going to devide by 0");
int b=30/0;
}
catch(ArithmeticException e1)
{
System.out.println("ArithmeticException=>"+e1.getMessage());
}
try
{
int a[]=new int[5];
a[5]=4;
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("IndexOutOfBoundsException=>"+e2);
}
catch(Exception e)
{
System.out.println("Exception=>"+e.getMessage());
}
System.out.println("Rest of Code.");
}
}