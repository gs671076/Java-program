public class MultipleTryCatchBlock
{
public static void main(String args[])
{
try
{
int arr[]=new int[5];
arr[5]=30/0;
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("IndexOutOfBoundsException=>"+e2.getMessage());
}
catch(ArithmeticException e1)
{
System.out.println("ArithmeticException=>"+e1.getMessage());
}
catch(Exception e)
{
System.out.println("Exception=>"+e.getMessage());
}
System.out.println("Rest of Code.");
}
}