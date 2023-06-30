//Approach 1  : T.C : O(n2)
public  class DiameterofTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHt=height(root.left);
        int rightHt = height(root.right);

        return Math.max(leftHt,rightHt)+1;
    }
    public static int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftD = diameter(root.left);
        int leftH = height(root.left);
        int rightD = diameter(root.right);
        int rightH = height(root.right);
        int selfDiam = leftH +rightH +1;
        return Math.max(selfDiam,Math.max(leftD,rightD));

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root));
    }
}