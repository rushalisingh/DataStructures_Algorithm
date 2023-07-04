public class PrintinRange {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    public static void printInRange(Node root , int k1 , int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            printInRange(root.left, k1, k2);
            System.out.println(root.data +" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1)
        {
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {

          /*  
                     8
                   /   \
                  5     10
                 /  \     \
                3    6     11
               /  \           \
              1   4            14        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left= new Node(3);
        root.left.left.left= new Node(1);
        root.left.left.right = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        printInRange(root, 8, 12);

    }
}
