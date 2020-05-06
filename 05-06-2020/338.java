class Solution {
    public int[] countBits(int num) {
        
        if(num==0)
        {
            return new int[]{0};
        }
        
        int[] dp=new int[num+1];
        
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                dp[i]=dp[i/2];
            }
            else
            {
                dp[i]=dp[i/2]+1;
            }
        }
        return dp;
        
        
    }
}