public class Selectionsort {

    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                //finds the minimum number from unsorted array
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            //swap the current position with the minimum value from unsorted array
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {

            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={ 4,3,5,2,1};
        selectionSort(arr);
        printArr(arr);
    }
}
