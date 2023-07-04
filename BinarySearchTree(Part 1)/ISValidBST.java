public class ISValidBST {
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
    }

    public static boolean isValidBST(Node root,Node min ,Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min!=null && root.data<=min.data)
        {
            return false;
        }
        else if(max!=null && root.data>=max.data)
        {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String[] args) {
        /*
            5
          /   \
         3     6
        /  \    \
       1    4    7
        */
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        if(isValidBST(root, null, null))
        {
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
