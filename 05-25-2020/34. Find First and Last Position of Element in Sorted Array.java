class Solution {
    int min;
    int max;
    int flag_min;
    int flag_max;
    public int[] searchRange(int[] nums, int target) {
        min=-1;
        max=-1;
        flag_min=0;flag_max=0;
        find(0,nums.length-1,nums,target);
        return(new int[]{min,max});    
    }
    
    public void find(int s,int e,int[] nums, int t)
    {
        if(s>e)
            return;
        // if(nums[s])
        
        int mid=(s+e)/2;
        if(nums[mid]<t)
        {
            find(mid+1,e,nums,t);
        }
        else if(nums[mid]>t)
        {
            find(s,mid-1,nums,t);
        }
        else
        {
            if(flag_min==0)
            {
                if(mid-1>=0 && nums[mid-1]==t)
                {
                    find(s,mid-1,nums,t);
                }
                else if(mid-1==-1  || nums[mid-1]!=t)
                {
                    min=mid;
                    // return;
                    flag_min=1;
                }
            }
            if(flag_max==0)
            {
                if(mid+1<nums.length && nums[mid+1]==t)
                {
                    System.out.println("rr");
                    find(mid+1,e,nums,t);
                }
                else if(mid+1==nums.length || nums[mid+1]!=t)
                {

                    max=mid;
                    flag_max=1;
                    // return;
                }
            }
            if(flag_min==1 && flag_max==1)
                return;
            
        }
    }
}