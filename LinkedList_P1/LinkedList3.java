public class LinkedList3 {
    //detect cycle/loop --Floyd's cycle finding algorithm
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
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
        newNode.next = head;
        head=newNode;
    }

    public static void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=null;
            return;
        }
        tail.next=newNode;
        newNode=tail;
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("No elements in the list");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data +" ->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static boolean detectCycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null)
        {
            slow=slow.next;
            fast =fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    //remove cycle
    // step1 - detect cycle -yes or no
    //step2 - slow =head 
    //        prev= null
    //         while(slow==fast)
    //          slow=+1
    //          fast=+1
    // step3 - prev.next=null

    public static void removeCycle()
    {
        //step1 - detect cycle
        Node slow=head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null)
        {
            slow = head.next;
            fast=head.next.next;
            if(slow==fast)
            {
                cycle= true;
                break;
            }
        }        
        if(cycle==false)
        {
            return;
        }
        //step 2 - find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //step3 -  remove cycle - last next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        //LinkedList ll = new LinkedList();
    //     ll.addLast(1);
    //     ll.addLast(2);
    //     ll.addLast(3);
    //     ll.addLast(4);
    //     ll.addLast(5);
    // 
        head= new Node(1);
        Node temp= new Node(2);
        head.next =temp;
        head.next.next= new Node(3);
        head.next.next.next=head;
        System.out.println(detectCycle());
        removeCycle();
        System.out.println(detectCycle());
   }

}
