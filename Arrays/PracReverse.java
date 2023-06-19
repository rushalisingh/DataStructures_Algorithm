public class PracReverse {

    public static void reverseArray(int arr[])
    {
        int start=0,last=arr.length-1;
        while(start<last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;

            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
