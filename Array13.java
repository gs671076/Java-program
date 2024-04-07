import java.util.*;
class Array12
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
int start=0,temp;
int end=arr.length-1;
while(start<end)
{
temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
return arr;
}
}
class Array13
{
public static void main(String args[])
{
Array12 a1=new Array12();
int  a[]=new int[10];
Scanner k=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
System.out.print("Enter a value: ");
a[i]=k.nextInt();
}
a1.printArray(a);
int result[]=a1.Array(a);
a1.printArray(result);
}
}