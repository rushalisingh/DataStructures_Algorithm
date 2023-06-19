public class Firstoccurence {
    
    public static int firstOcurrence(int arr[],int key , int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOcurrence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,2,5,9,8,2};
        System.out.println(firstOcurrence(arr, 5, 0));
    }
}
