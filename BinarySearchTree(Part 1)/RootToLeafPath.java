import java.util.ArrayList;

public class RootToLeafPath {
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i) +"->");
        }
        System.out.println("Null");
    }
    public static void printRoottoPath(Node root ,ArrayList<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }
        printRoottoPath(root.left, path);
        printRoottoPath(root.right, path);
        path.remove(path.size()-1); //backtracking step
    }

    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data +" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
         /*  
                     8
                   /   \
                  5     10
                 /  \     \
                3    6     11
               /  \           \
              1    4            14        */

         Node root = new Node(8);
        root.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left= new Node(3);
        root.left.left.left= new Node(1);
        root.left.left.right = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        printRoottoPath(root, new ArrayList<>());
    }
}
