class KnapsackQ1
{
    public static int knapSack(int val[] ,int wt[] ,int n, int w )
    {
        int dp[][] = new int [n+1][w+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<w+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
       return dp[n][w];
    }
    
    public static void main(String args[])
    {
        int n=2,w=3;
        int val[] ={1,1};
        int wt[] = {2,1};
        int dp[][] = new int [n][w];
        System.out.println(knapSack(val,wt,n,w));
    }
}