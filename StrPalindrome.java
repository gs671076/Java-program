import java.util.*;
class StrPalindrome
{
public static void main(String args[])
{
String s1;
String s2;
int flag=0;
Scanner k=new Scanner(System.in);
System.out.print("Enter First String");
s1=k.nextLine();
System.out.print("Enter First String");
s2=k.nextLine();
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
int start=0;
int end=c1.length-1;
i=0;
while(start<end)
{
if(c1[start]!=c2[start])
{
flag++;
break;
}
start++;
start1++;
}
if(flag==0)
{
System.out.println("Strings are Palindrome");
}
else
{
System.out.println("Strings are not Palindrome");
}
}
}