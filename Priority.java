class Priority  extends Thread
{
public void run()
{
System.out.println("Name Of  Current Thread is: "+Thread.currentThread().getName());
System.out.println("Priority Of  Current Thread is: "+Thread.currentThread().getPriority());
}
public static void main(String args[])
{
Priority p1=new Priority();
Priority p2=new Priority();
p1.setPriority(Thread.MIN_PRIORITY);
p2.setPriority(Thread.MAX_PRIORITY);
p1.start();
p2.start();
}
}