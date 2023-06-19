import java.util.*;
public class PracSubaarays {

    public static void printSubarrays(int arr[])
    {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[] =new int[arr.length];

        prefix[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
         for(int i=0;i<arr.length;i++)
         {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                curr_sum=0;
                int end=j;
                curr_sum = start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                } 
            }
         
         }
         System.out.println("max sum = "+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubarrays(arr);
    }
    
}
