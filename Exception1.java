import java.io.*;
import java.util.*;
class Exception1
{
public static void main(String args[])
{
String str=null;
System.out.println("A");
try{
System.out.println(5/0);
System.out.println(str.length());
;
}
catch(ArithmeticException e1)
{
System.out.println(e1.getMessage());
}
try
{
System.out.println(str.length());

}
catch(NullPointerException p1)
{
System.out.println(p1.getMessage());
}
System.out.println("B");
}
}