class Solution {
    public int jump(int[] nums) {
        
        int[] dp=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--)
        {
            int min=nums.length;
            for(int j=i+1;j<=i+nums[i] && j<nums.length;j++)
            {
                min=Math.min(dp[j],min);
            }
            min++;
            dp[i]=min;
        }
        
        for(int i: dp)
        {
            System.out.print(i+" ");
        }
        
        if(dp[0]>=nums.length)
            return nums.length-1;
        
        return dp[0];
    }
}