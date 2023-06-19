public class Pairedarr {


    public static void pairsinArray(int arr[])
    {
        for(int i=0 ;i<arr.length;i++)
        {
            int current = arr[i]; //if i=0 ,current = 2  -> i++ ; i=1 , current = 4 ->i++ ; i=2 ....
            for(int j=i+1 ;j <arr.length ;j++)
            {
                System.out.print( "("+current+","+arr[j]+")" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairsinArray(arr);
    }
    
}
