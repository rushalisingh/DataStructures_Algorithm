import java.util.*;
public class Ques1 {

    static boolean isPermutable(int a1[] ,Integer a2[],int n , int k)
    {
        Arrays.sort(a1);
        Arrays.sort(a2,Collections.reverseOrder()); 
        
        for(int i=0;i<n;i++)
        {
            if(a1[i]+a2[i]<k)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        int a1[]={2,0,3};
        Integer a2[] ={7,8,9};
        int n=a1.length;
        int k=10;
        if(isPermutable(a1, a2, n, k))
        {
            System.out.println("Yes");
        }
        else {
        System.out.println("No");
        }
    }
}
