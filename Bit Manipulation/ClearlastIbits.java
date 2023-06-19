public class ClearlastIbits {

    public static int clearLastIthBits(int n , int i)
    {
        int bitmask =(~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBits(15, 3));
    }
    
}
