public class UpdateIthbit {
    public static int setIthbit(int n , int i)
    {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthbit(int n , int i , int newbit)
    {
        if(newbit==0)
        {
            return clearIthBit(n, i);
        }
        else
        {
            return setIthbit(n, i);
        }
    }
    public static void main(String[] args) {
        System.out.println(updateIthbit(5, 3, 1));
    }
    
}
