package Pattern;
class Pattern5
{
public static void main(String args[])
{
int i,j;
for(i=0;i<5;i++)
{
for(int k=0;k<i;k++)
{
System.out.print(" ");
}
int k=1;
for(j=i;j<5;j++)
{
System.out.print(j+1);
k++;
}
System.out.println();
}
}
}