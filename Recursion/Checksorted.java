import java.util.*;
public class Checksorted
{
    public static boolean sorted(int arr[], int i)
    {
        //base case
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return sorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.print(sorted(arr,0));
    }
}