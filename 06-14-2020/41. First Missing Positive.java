class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans=nums.length+1;
        int one_present=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                one_present=1;
            if(nums[i]<=0 || nums[i]>nums.length)
            {
                nums[i]=1;
            }
        }
        
        if(one_present==0)
            return 1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[Math.abs(nums[i])-1]>=1)
            {
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*(-1);
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
            
        }
        System.out.println("rr");
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                ans=i+1;
                break;
            }
        }
        return ans;
        
    }
}