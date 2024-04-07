import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        String str;
        Scanner d = new Scanner(System.in);
System.out.print(" Enter any String:  ");
        str = d.nextLine();
char c1[]=str.toCharArray();
int end =c1.length-1;
int start=0;
char temp;
while(start<end)
{
temp=c1[start];
c1[start]=c1[end];
c1[end]=temp;
start++;
end--;
}
String s=new String(c1);
if(s.equals(str))
{
System.out.println(str+" is Palindrome");
}
else
{
System.out.println(str+" is not Palindrome");
}
}
}