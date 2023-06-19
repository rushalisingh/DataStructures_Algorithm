import java.util.*;
public class LinkedList{

    public static class Node
    {
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
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addMid(int index,int data)
    {
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;

    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev= i-size-2
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    // public int itrSearch(int key) // time - O(n)
    // {
    //     Node temp=head;
    //     int i=0;
    //     while(temp!=null)
    //     {
    //         if(temp.data==key)
    //         {
    //             return i;
    //         }
    //         temp=temp.next;
    //         i++;
    //     }
    //     return -1;
    // }

    public int helper(Node head,int key) //O(n)
    { 
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx==-1)
        {
            return -1;
        }
        
        return idx+1;
    }
    public int recSearch(int key)
    {
        return helper(head, key);
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
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
    public Node getMid(Node head)
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

    public Node merge(Node head1 , Node head2){
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
    public void zigzag()
    {
            //find mid
            Node slow = head;
            Node fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=head.next;
                fast=fast.next.next;
            }
            Node mid = slow;
            //reverse 2nd half
            Node curr = mid.next;
            mid.next=null;
            Node prev =null;
            Node next;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            //alternate merge / zigzag merge
            Node left = head;
            Node right = prev;
            Node nextL , nextR;
            while(left!=null && right !=null)
            {
                nextL = left.next;
                left.next=right;
                nextR = right.next;
                right.next=nextL;

                left = nextL;
                right = nextR;
            }
    }
    public void printLL()
    {
        if (head==null)
        {
            System.out.println("No elements in the list");
            return;
        }
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
       
        //ll.addMid(2, 9);
        // ll.print();
        // //System.out.println(ll.size);
        // // ll.removeFirst();
        // // ll.print();
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println(ll.itrSearch(3));
        // // System.out.println(ll.itrSearch(10));
        // // System.out.println(ll.recSearch(3));
        // // ll.reverse();
        // // ll.print();

        // // ll.deleteNthfromEnd(3);
        // // ll.print();
        // ll.head=ll.mergeSort(head);
        ll.printLL();
        ll.zigzag();
        ll.printLL();
    }

   
   
}