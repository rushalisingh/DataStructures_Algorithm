import java.util.*;

public class Subarr {
    
    public static void printSubarrays(int arr[])
    {
        for(int i=0 ;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length ;j++) // j!= i+1 because we want single element subarray too ! i.e , 2 or 4 or 6 ...
            {
                int end= j;
                for(int k=start ;k<=end ;k++)
                {
                    System.out.print(arr[k] + " "); // prints all subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[] ={ 2,4,6,8,10};
        printSubarrays(arr);
    }
}
