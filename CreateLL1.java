import java.util.*;

class LinkedListNode {
    int data;
    LinkedListNode next;
}

public class CreateLL1 {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the data for the first node of linked list: ");
        int data = k.nextInt();
        LinkedListNode start = new LinkedListNode();
        start.data = data;
        start.next = null;
        LinkedListNode ptr = start;
        char c;
        do {
            System.out.print("Enter the data for the next node of linked list: ");
            LinkedListNode temp = new LinkedListNode();
            temp.data = k.nextInt();
            temp.next = null;
            ptr.next = temp;
            ptr = temp;
            System.out.print("Do you want to enter more nodes? (Y/N): ");
            c = k.next().charAt(0);
        } while (c == 'Y' || c == 'y');
    }
}
