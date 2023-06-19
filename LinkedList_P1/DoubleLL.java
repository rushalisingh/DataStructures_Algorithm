import java.util.*;
public class DoubleLL {
    
    public static class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head=head.next;
        head.prev= null;
        size--;
        return val;
    }

    public void reverseDLL()
    {
        Node curr =head;
        Node prev=null;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void printLL()
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printLL();
        System.out.println(dll.size);
        //dll.removeFirst();
        //dll.printLL();
        dll.reverseDLL();
        dll.printLL();

    }

}
