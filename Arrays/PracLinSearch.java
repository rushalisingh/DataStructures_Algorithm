public class PracLinSearch
{
    public static int LinSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int key=4;
        int index=LinSearch(arr, key);
        if(index==-1)
            {
                System.out.print("Not found");
            }
            else{
                System.out.print("Key found at : "+index);
            }
            System.out.println();
        }
}