class Solution {
    public int numTrees(int n) {
        
        int[]dp=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            sum=0;
            for(int j=i-1;j>=0;j--)
            {
                sum+=dp[j]*dp[i-j-1];  //catalan number   (2n)!/((n+1)! * n!)
                /*
                4
                3 0   3 are small and 0 are greater
                2 1
                1 2
                0 3
                */
            }
            dp[i]=sum;
        }
        return dp[n];
    }
}