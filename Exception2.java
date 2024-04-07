class Exception2
{
public static void main(String args[])
{
String str=null;

System.out.println("A");
try{
System.out.println(str.length());
}
catch(NullPointerException d1)
{
System.out.println(d1.getMessage());
}
finally
{
System.out.println("Final block executed");
}
}
}