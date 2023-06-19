import java.util.*;
public class ChocolateDistribution {
    
    public static int chocolateDistribution(int arr[] ,int n,int m)
    {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
            minDiff=Math.min(arr[i+m-1]-arr[i],minDiff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[]={7, 3, 2, 4, 9, 12, 56};
        int n = arr.length;
        int m=3;
         System.out.println("minDiff :  "+chocolateDistribution(arr,n,m)); 
    }
}
