class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<left.length;i++)
        {
            left[i]=nums[i]*left[i-1];
            System.out.println(left[i]+" l");
        }
        
        int right_prod=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==0)
            {
                nums[i]=right_prod;
                break;
            }
            int temp=nums[i];
            nums[i]=left[i-1]*right_prod;
            right_prod*=temp;
        }
        
        return nums;
            
    }
}