class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp=new int [n];
        
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=1;
            // 1 1 1 1
        }
        for(int k=0;k<m-1;k++)
        {
            for(int i=0;i<dp.length;i++)
            {
                if(i!=0)
                {
                    // dp[i]=dp[i];
                    dp[i]=dp[i]+dp[i-1];
                    // 1 x x x 
                }        
            }
        }
        return dp[n-1];
    }
}