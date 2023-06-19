public class FindSubsets {
    
    public static void findSubsets(String str , String ans , int i)
    {
        //base
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }

        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, "", 0);
    }
}
