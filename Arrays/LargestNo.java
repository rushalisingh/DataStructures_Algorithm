public class LargestNo 
{
    public static void getLargest( int numbers[]) 
    {
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) 
        {
            if(largest <numbers[i])
            {
                largest = numbers[i];
            }

            if (smallest >numbers[i])
            {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+ smallest);
        // return largest;
        System.out.println("Largest value is : "+ largest);

    }
    public static void main(String[] args) {
        int numbers[]={ 10 , 35 , 49, 56, 66, 89};
        // System.out.print(getLargest(numbers));
        getLargest(numbers);
    }

}
