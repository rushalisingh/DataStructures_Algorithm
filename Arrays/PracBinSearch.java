public class PracBinSearch {

    public static int binSearch(int arr[],int key)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,24,36,48,60,72,84,96,108};
        int key=60;
        System.out.println(binSearch(arr,key));
    }
}
