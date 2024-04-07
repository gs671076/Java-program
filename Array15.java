import java.util.*;
class Array14
{
void printArray(int[] arr)
{
System.out.println("Array is");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
}
int[] Array(int[] arr)
{
int oddcount=0,j=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2!=0)
{
oddcount++;
}
}
int result[]=new int[oddcount];
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2!=0)
{
result[j]=arr[i];
j++;
}
}
return result;
}
}
class Array15
{
public static void main(String args[])
{
Array14 a1=new Array14();
int  a[]=new int[10];
Scanner k=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
System.out.print("Enter a value: ");
a[i]=k.nextInt();
}
a1.printArray(a);
int result[]=a1.Array(a);
System.out.println(" Array After removing even element");
a1.printArray(result);
}
}