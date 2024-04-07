public class TryCatchExample9
{
public static void main(String args[])
{
try
{
int arr[]={1,3,5,7};
System.out.println(arr[10]);
}
catch(ArrayIndexOutOfBoundsException e2)
{
System.out.println("IndexOutOfBoundsException=>"+e2.getMessage());
}
}
}