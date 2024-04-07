interface Callback
{
void callback(int param);
}
class Client implements Callback
{
public void callback(int p)
{
System.out.println("callback called with"+p);
}
void nonIfaceMeth()
{
System.out.println("Method");}
}
class TestIface
{
public static void main(String args[])
{
Callback c=new Client();
Client n=new Client();
c.callback(42);
n.nonIfaceMeth();
//c.nonIfaceMeth();
}
}