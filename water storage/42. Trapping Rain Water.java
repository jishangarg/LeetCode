class Solution {
    public int trap(int[] height) {
        
        if(height.length<3)
            return 0;
        int max=0,max_i=0;
        for(int i=0;i<height.length;i++)
        {
            max=Math.max(max,height[i]);
            if(max==height[i])
                max_i=i;
        }
        
        int l_max=0;
        int r_max=0;
        int sum=0;
        for(int i=0;i<=max_i;i++)
        {
            if(l_max<height[i])
                l_max=height[i];
            sum+=l_max-height[i];
        }
        for(int i=height.length-1;i>max_i;i--)
        {
            if(r_max<height[i])
                r_max=height[i];
            sum+=r_max-height[i];
        }
        return sum;
    }
} 



//brilliant solution