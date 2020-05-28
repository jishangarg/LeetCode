class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i]+i,max);
            if(nums[i]==0 && max<=i && i!=nums.length-1)
            {
                return false;
            }
        }
        return true;
    }
}