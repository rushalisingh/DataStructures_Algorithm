import java.util.*;
public class PracQues1 {

    public static boolean monotonicArray( ArrayList <Integer> list)
    {
        int n=list.size();
        if(n<=2)
        {
            return true;
        }
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=1;i<n;i++)
        {
            if(list.get(i-1)>list.get(i))
            {
                increasing=false;
            }
            else if(list.get(i-1)<list.get(i))
            {
                decreasing=false;
            }
            if(!increasing && !decreasing)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        //list.add(4);
        System.out.println(monotonicArray(list));
    }
}
