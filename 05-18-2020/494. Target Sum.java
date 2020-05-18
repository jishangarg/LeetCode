class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        
        if(S>1000 || S<-1000)
            return 0;
        
        int[][] dp=new int[nums.length+1][2001];
        dp[nums.length][S+1000]=1;
        for(int i=nums.length;i>=1;i--)
        {
            for(int j=0;j<=2000;j++)
            {
                if(dp[i][j]!=0)
                {
                    if(j-nums[i-1]>=0){
                        dp[i-1][j-nums[i-1]]+=dp[i][j];
                    }
                    if(j+nums[i-1]<=2000){
                        dp[i-1][j+nums[i-1]]+=dp[i][j];
                    }
                }
            }
        }
        return dp[0][1000];
        
    }
}


// class Solution {
//     int[][] dp;
//     public int findTargetSumWays(int[] nums, int S) {
//         int curr_S=0;
//         int index=0;
//         dp=new int[nums.length][2001];
//         for(int i=0;i<dp.length;i++)
//         {
//             Arrays.fill(dp[i],5000);
//         }
        
//         return ways(nums,S,curr_S,index);
//     }
    
//     public int ways(int[] nums,int S,int curr_S,int index)
//     {
        
//         if(index==nums.length)
//         {
//             if(curr_S==S)
//                 return 1;
//             else
//                 return 0;
//         }
        
//         if(dp[index][curr_S+1000]==5000)
//         {
//             dp[index][curr_S+1000]=ways(nums,S,curr_S+nums[index],index+1) + ways(nums,S,curr_S-nums[index],index+1);
//         }
//         return dp[index][curr_S+1000];
//         // return ways(nums,S,curr_S+nums[index],index+1) + ways(nums,S,curr_S-nums[index],index+1);
//         // return ways(nums,S,curr_S-nums[index],index+1);
        
//     }
// }