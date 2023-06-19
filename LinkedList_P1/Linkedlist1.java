import java.util.*;

public class Linkedlist1 {
    
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next= null;
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


    public static void addMid(int index,int data)
    {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1)
        {
            temp =temp.next;
            i++;
        }
        //i= index-1 
        newNode.next = temp.next;
        temp.next= newNode;
    }

    //remove first
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
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    //remove last
    public int removeLast()
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
        Node prev = head;
        for (int i=0; i<size-2;i++)
        {
         prev = prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
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

    public int itrSearch(int key)
    {
        Node temp = head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    } 
    public int helper (Node head , int key)
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
        return helper(head,key);
    }

    //used slow-fast approach
    public Node findMid(Node head) //helper
    {
        Node slow = head;
        Node fast= head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//returns middle value
    }

    public boolean checkPalindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //step1 - find mid (use helper func)
        Node midNode = findMid(head);
        //step2 - reverse 2nd half
        Node prev= null;
        Node curr= midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //step3 - check left half and right half
        Node right = prev ;// right half head
        Node left = head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main (String args[])
    {
       LinkedList l1 = new LinkedList();
       //methods
    //    l1.addFirst(2);
    //    l1.addFirst(1);
    //    l1.addFirst(0);
    //    l1.addLast(3);
    //    l1.addLast(4);
    //    l1.addMid(2,9);
    //    l1.print();
    //System.out.println(l1.size);
    //l1.removeFirst();
    //l1.print();
    //l1.removeLast();
    //l1.print();
        // System.out.println(l1.recSearch(3));
        // //System.out.println(l1.itrSearch(10));
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(1);
        l1.print();
        System.out.println(l1.checkPalindrome());
    }

}
