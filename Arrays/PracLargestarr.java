public class PracLargestarr {

    public static int largestelement(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        //int greatest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(largestelement(arr));
    }
}
