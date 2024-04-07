package P2;
class OtherPackage
{
OtherPackage()
{
P1.Protection p=new P1.Protection();
System.out.println("Other Package Constructor.");
System.out.println("n_pub="+p.n_pub);
}
}