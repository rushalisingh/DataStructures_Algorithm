public class PracBubble
{
    public static void bubbleSort(int arr[])
    {
        int swaps=0;
        for(int i=0;i<arr.length;i++)
        {
            swaps=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                swaps++;
            }
        }
        System.out.println("Total swaps : "+swaps);
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 public static void main(String[] args) {
    //int arr[]={5,4,3,2,1};
    int arr[]={1,2,3};
    bubbleSort(arr);
    printArray(arr);
 }
}