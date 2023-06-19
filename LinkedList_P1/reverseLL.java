import java.util.*;
public class reverseLL {
    
    public static class Node{
        int data;
        Node next;
        public Node (int data)
        {
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=null;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void print()
    {
        if(head==null)
        {
            head=tail=null;
            System.out.println("No elements in lsit");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    //delete feom nth node
    public void deleteNthfromEnd(int n)
    {
        int size=0;
        Node temp = head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        //when remove head
        if(n ==size)
        {
            head=head.next; //removefirst
            return;
        }
        //other cases
        //size-n
        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while(i<iToFind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public void reverse()
    {
        Node prev = null;
        Node curr=tail= head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head =prev;
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        // l1.reverse();
        // l1.print();
        l1.deleteNthfromEnd(3);
        l1.print();
    }
}
