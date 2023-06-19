import java.util.Scanner;

import java.util.*;
public class CreateArrsyntax {

 
    public static void reverseArray(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

public static void main(String[] args) {
    int arr[]={23,33,43,53,63,73};
    reverseArray(arr);
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i] + "  ");
    }
    }
}


