class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int min=1;
        int max=1;
        int curr_max=1;
        int curr_min=1;
        // int curr_min=1;
        // int curr_max=1;
        int flag=0;
        
        for(int i=0;i<nums.length;i++)  //ending at particular index
        {
            
             if(nums[i]<0)
             {
                 if(curr_min<0)
                     flag=1;
                 
                 int temp=curr_max;
                 curr_max=Math.max(curr_min*nums[i],1);
                 curr_min=temp*nums[i];
                 
                 max=Math.max(curr_max,max);
                 min=Math.min(curr_min,min);
                 
                 
                 
             }
             else if(nums[i]>0)
             {
                 flag=1;
                 curr_max=curr_max*nums[i];
                 
                 curr_min=Math.min(curr_min*nums[i],1);
                 
                 max=Math.max(curr_max,max);
                 min=Math.min(curr_min,min);
             }
            else
            {
                curr_min=1;
                curr_max=1;
            }
            System.out.println("curr_min "+curr_min+" curr_max "+curr_max); //y this running
        }
        System.out.println(flag);
        if(flag==0 && max==1)
            return 0;
        return max;
    }
}