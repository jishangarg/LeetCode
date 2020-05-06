class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int si=0;
        int ei=nums.length-1;
        int i=0;
        while(i<nums.length-1 && nums[i]<=nums[i+1])
        {
            i++;
        }
        si=i;
        
        i=nums.length-1;
        while(i>0 && nums[i]>=nums[i-1])
        {
            i--;
        }
        ei=i;
        if(ei==0 && si==nums.length-1)
            return 0;
        
        int min=99999999;
        int max=-99999999;
        for(int j=si;j<=ei;j++)
        {
            if(nums[j]>max)
                max=nums[j];
            if(nums[j]<min)
                min=nums[j];
            
        }
        
        i=si;
        while(i>=0 && nums[i]>min)
        {
            i--;
        }
        
        int f=i+1;
        
        i=ei;
        while(i<=nums.length-1 && nums[i]<max)
        {
            i++;
        }
        int l=i-1;
        
        System.out.println("si "+si+" ei "+ei+" min "+min+" max "+max);
        return l-f+1;
    }
}

//other soln???