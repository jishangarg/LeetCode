class Solution {
    int ans;
    public int search(int[] nums, int target) {
        ans=-1;
        if(nums.length==0)
            return -1;
        search(0,nums.length-1,nums,target);
        return ans;
    }
    
    public void search(int s,int e,int[] nums,int t)
    {
        
        int m=(s+e)/2;
        System.out.println(nums[m]+" "+t);
        System.out.println("se "+s+" "+e);
        if(nums[m]==t)
        {
            ans=m;
            return;
        }
        if(s>=e || s<0 || e>=nums.length)
            return;
        
        System.out.println("rr1");
        if(nums[m]>=nums[s] && nums[m]>nums[e])
        {
            System.out.println("rr2");
            if(nums[m]<t)
            {
                search(m+1,e,nums,t);
            }
            if(nums[m]>t)
            {
                if(t>=nums[s])
                {
                    search(s,m-1,nums,t);
                }
                else if(t<=nums[e])
                {
                    search(m+1,e,nums,t);
                }
            }
        }
        else if(nums[m]<nums[s] && nums[m]<=nums[e])
        {
            System.out.println("rr3");
            if(nums[m]>t)
            {
                search(s,m-1,nums,t);
            }
            else if(nums[m]<t)
            {
                if(t>=nums[s])
                {
                    search(s,m-1,nums,t);
                }
                else if(t<=nums[e])
                {
                    search(m+1,e,nums,t);
                }
            }
        }
        else if(nums[m]>=nums[s] && nums[m]<=nums[e])
        {
            System.out.println("last");
            if(nums[m]<t)
            {
                search(m+1,e,nums,t);
            }
            else
            {
                search(s,m-1,nums,t);
            }
        }
        // else if(m<s && m>e)
        //     return;
        // return;
    }
}