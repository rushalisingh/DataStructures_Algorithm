public class BubbleSort{

    public static void bubbleSort(int arr[])
    {
        for(int turns=0 ;turns<arr.length-1;turns++)
        {
            for(int j=0; j<arr.length-1-turns;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={ 1,4,5,3,9,2,7,6,8};
        bubbleSort(arr);
        printSort(arr);
    }
}