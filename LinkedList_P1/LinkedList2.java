//import java.util.LinkedList;

public class LinkedList2 {

    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
     public static void addFirst(int data)
    {
        Node newNode  = new Node(data);
        size++;
        if(head==null)
        {
            head = tail=null;
            return;
        }
        newNode.next = head;
        head= newNode;
    }
    //ADD LAST 
    public static void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=null;
            return;
        }
        tail.next= newNode;
        newNode=tail;
    }

    private Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null)
        {
            slow=head.next;
            fast=head.next.next;
        }
        return slow;
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 !=null && head2 !=null)
        {
            if(head1.data <=head2.data)
            {
                temp.next=head1;
                head1= head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next; //as mergedLL ke head mein -1 store hai which we have to ignore
    }
    //megre sort in LL
    //step1 - LL - middle 
    //step 2 - left half - mergesort
    // righthalf - mergesort
       // mid.next=null
    // step3 - merge
    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next=null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft , newRight);

    }
    public void print()
    {
        if (head==null)
        {
            System.out.println("No elements in the list");
            return;
        }
        Node temp = head;
        while(temp!= null)
        {
            System.out.println(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main (String args[])
{
    //create
    LinkedList ll = new LinkedList();
    //add
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addFirst(0);
    ll.print();
    //remove
    // ll.removeLast();
    // ll.removeFirst();
    LinkedList2.mergeSort(ll.head);
    ll.print();
    }
}
