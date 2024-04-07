class VarArgs
{
static void vaTest(int ...v)
{
System.out.println("Number of args: "+v.length+" Contents");
for(int x:v)
{
System.out.print(x+" ");
}
System.out.println();
}
public static void main(String args[])
{
vaTest();
vaTest(10);
vaTest(1,2,3);
vaTest(1,2,3,4,5,6,7);
}
}