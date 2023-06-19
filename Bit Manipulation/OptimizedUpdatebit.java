public class OptimizedUpdatebit {
    public static int clearIthBit(int n , int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

   public static int updateIthbit(int n ,int i , int newbit)
   {
        n = clearIthBit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
   }
   public static void main(String[] args) {
         System.out.println(updateIthbit(6, 0, 1));
   }
}
