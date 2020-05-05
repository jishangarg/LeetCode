class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0,j=0,flag=0;
        while(i<nums.length)
        {
            if(i<nums.length && nums[i]!=0 && flag==1)
            {
                swap(i,j,nums);
                j++;
                flag=0;
                
                System.out.println("a "+i+" "+j);
                    
            }
            
            if(i<nums.length && nums[i]!=0 && flag==0)
            {
                i++;
                j++;
                System.out.println("b "+i+" "+j);
            }
            if(i<nums.length && nums[i]==0)
            {
                i++;
                flag=1;
                System.out.println("c "+i+" "+j);
            }
        }
    }
    public void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

//recursion?