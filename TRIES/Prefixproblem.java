public class Prefixproblem {
    
    static class Node {
        Node [] children = new Node[26];
        boolean eow = false;
        int freq;
        Node() {
            for(int i=0;i<children.length;i++)
            {
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word)
    {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i) -'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]= new Node();
            }
            else
            {
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String key)
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int idx= key.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow==true;
    }

    public static void findPrefix(Node root , String ans)
    {
        if(root==null)
        {
            return;
        }
        else if(root.freq==1)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null)
            {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] ={"zebra" ,"dog" ,"duck" ,"dove"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        root.freq=-1;
        findPrefix(root, "");
    }
}
