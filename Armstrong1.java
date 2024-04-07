import java .util.Scanner;
class Armstrong1
{
public static void main(String args[])
{
int num,i,j,r,sum=0;
int num1,num2;
Scanner k=new Scanner(System.in);
System.out.print("Enter any number: ");
num=k.nextInt();
num2=num1=num;
for(i=0;num1>0;i++)
{
num1/=10;
}
while(num2>0)
{
r=num2%10;
sum+=Math.pow(r,i);
num2/=10;
}
if(sum==num)
{
System.out.println(num+" is Armstrong Number");
}
else
{
System.out.println(num+" is not Armstrong Number");
}
}
}