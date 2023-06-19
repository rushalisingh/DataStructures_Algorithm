public class NextPermutation {
    
    public static void nextPermutation(int arr[])
    {
        int fixeddigit=arr[0];
        for(int i=arr.length-1;i>=1;i--)
        {
            if(arr[i]>arr[i-1])
            {
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        nextPermutation(arr,);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + ",");
        }
    }
}
