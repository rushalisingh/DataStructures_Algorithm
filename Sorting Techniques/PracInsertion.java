public class PracInsertion {
    
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];//curr - 2nd ele
            int prev=i-1;//index to first ele
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            } 
            arr[prev+1]=curr;
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5};
        insertionSort(arr);
        printArray(arr);
    }
}
