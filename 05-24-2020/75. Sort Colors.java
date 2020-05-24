class Solution {
    public void sortColors(int[] nums) {
        int p1=0, p2=0,p3=nums.length-1;
        
        
        // while(p1<=p3 && nums[p1]==0)
        //     p1++;
        // p2=p1+1;
        
        while(p2<=p3){
            if(nums[p2]==0)
            {
                replace(p1,p2,nums);
                p1++;
                p2++;
                // if(p1>p2)
                //     p2=p1;
            }
            else if(nums[p2]==2)
            {
                // System.out.println("rr");
                replace(p2,p3,nums);
                // p2++;
                p3--;
            }
            else
                p2++;
            
            
        }
        
        
    }
    public void replace(int p1,int p2,int[] nums)
    {
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}

//class Solution {
//     public void sortColors(int[] nums) {
//         int p1=0, p2=0;
        
//         while(p2<nums.length){
//             if(nums[p2]==0)
//             {
//                 replace(p1,p2,nums);
//                 p1++;
//                 p2++;
//             }
//             else
//             {
//                 p2++;
//             }
//         }
//         p2=p1;
//         while(p2<nums.length)
//         {
//             if(nums[p2]==1)
//             {
//                 replace(p1,p2,nums);
//                 p1++;
//                 p2++;
//             }
//             else
//             {
//                 p2++;
//             }
//         }
        
//     }
//     public void replace(int p1,int p2,int[] nums)
//     {
//         int temp=nums[p1];
//         nums[p1]=nums[p2];
//         nums[p2]=temp;
//     }
// }