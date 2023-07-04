public class MirrorBST {
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node createMirror(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }

    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
         /*  
                     8
                   /   \
                  5     10
                 /  \     \
                3    6     11
        */

        /* Expected output
                      8
                    /   \
                   10     5
                  /     /   \
                 11     6    3
         */

         Node root = new Node(8);
        root.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left= new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);

        createMirror(root);
        preOrder(root);
    }
}
