import java.util.*;
class LinkedListNode
{
int data;
LinkedListNode next;
}
class CreateLL
{
static void display(LinkedListNode ptr)
{
System.out.println("Linked List is ->");
while(ptr!=null)
{
System.out.print(ptr.data+" ");
ptr=ptr.next;
}
}
public static void main(String args[])
{
LinkedListNode start=new LinkedListNode();
Scanner k=new Scanner(System.in);
System.out.print("Enter the  First Node of linked list: ");
start.data=k.nextInt();
start.next=null;
LinkedListNode ptr=new LinkedListNode();
ptr=start;
char c;
do
{
LinkedListNode temp=new LinkedListNode();
System.out.print("Enter the  Next Node of linked list: ");
temp.data=k.nextInt();
temp.next=null;
ptr.next=temp;
ptr=temp;
System.out.print("Do You Want to Enter more Nodes. ");
c=k.next().charAt(0);
}
while(c=='Y'||c=='y');
display(start);
}
}