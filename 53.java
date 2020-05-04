class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        
        int ps=nums[0],ms=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            ps= Math.max(nums[i],ps+nums[i]);
            ms=Math.max(ps,ms);
        }
        return ms;
    }
}