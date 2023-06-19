public class RemoveDuplicate {
    
    public static void removeduplicates(String str, int idx, StringBuilder newStr,boolean map[])
    {
        if(idx==str.length()-1)
        {
            System.out.println(newStr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true)
        {
            removeduplicates(str, idx+1, newStr, map);
        }
        else{
            map[currchar='a']=true;
            removeduplicates(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnacollege";
        removeduplicates(str,0, new StringBuilder(""),new boolean[26]);
    }

}
