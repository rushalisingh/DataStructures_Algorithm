public class OptimizedXpowerN {
    
    public static int optimizedPower(int a,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfpower =optimizedPower(a, n/2) *optimizedPower(a, n/2);

        if(n%2!=0) //odd
        {
            halfpower= a*halfpower;
        }

        return halfpower;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(4, 4));
    }
}
