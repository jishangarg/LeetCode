class Solution {
    public int maxArea(int[] height) {
        
        int s=0;
        int e=height.length-1;
        int max_area=Integer.MIN_VALUE;
        while(s<e)
        {
            if(height[s]<=height[e])
            {
                max_area=Math.max(max_area,height[s]*(e-s));
                s++;
            }
            else
            {
                max_area=Math.max(max_area,height[e]*(e-s));
                e--;
            }
        }
        
        return max_area;
        
    }
}