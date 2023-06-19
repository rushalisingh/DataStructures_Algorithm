public class BinSearch 
{ 
   
   public static int binSearch (int arr[],int key)
   {
      int start= 0;
      int end =arr.length-1;

      while(start<=end)
      {
        int mid =(start+end)/2;
        if(arr[mid] ==key)
        {
            return mid;
        }
        else if( arr[mid] > key)
        {
            end = mid-1;
        }
        else 
        {
            start = mid+1;
        }
      }
      return -1;
   }
   
    public static void main(String[] args)
    {
        int arr[ ]= { 10 , 15,20,25,30,45 ,65};
        int key = 45;
        System.out.print(binSearch(arr, key));
    }
    

}
