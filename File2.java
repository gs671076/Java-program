import java.io.*;
class File2
{
public static void main(String args[])throws IOException
{
String s1="Radha Krishna";
File f1=new File("a.text");
FileOutputStream h1=new FileOutputStream(f1,true);
char c1[]=s1.toCharArray();
for(int i=0;i<c1.length;i++)
{
h1.write(c1[i]);
}
h1.close();
}
}