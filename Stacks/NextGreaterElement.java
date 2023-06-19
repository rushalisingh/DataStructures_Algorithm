import java.util.*;
public class NextGreaterElement {
    //next greater right
    public static void main(String[] args) {
        int arr[] ={ 8 ,7, 9, 2 , 3, 10};
        Stack <Integer> s = new Stack<>();
        int nextGreater [] = new int [arr.length];

        for(int i=arr.length-1;i>=0;i--) // reverse the loop if question asked 'from left'
        {
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]) // arr[s.peek()]>=arr[i]  = for smaller element
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++)
        {
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();

    }

}
// more possible questions
// next greater left
// next smaller right
// next smaller left