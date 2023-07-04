public class DeleteBST {
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
    }

    // 3 cases has to be considered  
    //  case 1 : no child - delete node and return null
    //  case 2: single child - delete node and replace node with child node
    //  case 3: both child exists - find inOrder successor and replace the node to be deleted with it.

    public static Node delete (Node root , int val)
    {
        if(root.data<val)
        {
            root.right = delete(root.right, val);
        }
        else if(root.data>val)
        {
            root.left = delete(root.left, val);
        }
        else {
            //3 cases executed here
            //case 1 - no child
            if(root.left == null && root.right==null)
            {
                return null;
            }
            //case 2 - single child
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            //case 3 - both child present - find inorderSuccessor - leftmost node in rightSubtree
            Node IS = findINorderSuccessor(root.right);
            root.data=IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findINorderSuccessor (Node root)
    {
        while(root.right!=null)
        {
            root=root.left;
        }
        return root;
    }

    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String args[])
    {
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

        delete(root, 5);
        inOrder(root);
    }


}
