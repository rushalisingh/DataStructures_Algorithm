public class FibonacciofN {

    public static int fibo(int n)

    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fn1=fibo(n-1);
        int fn2=fibo(n-2);
        int fn=fn2+fn1;
        return fn;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.print(fibo(n));
    }
    
}
