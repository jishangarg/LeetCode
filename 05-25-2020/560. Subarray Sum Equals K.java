class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        // sum+=nums[0];
        // map.put(nums[0],1);
        for(int i=0;i<nums.length;i++)
        {
            int to_put=nums[i]+sum;;
            sum=to_put;
            if(map.containsKey(to_put-k))
                count+=map.get(to_put-k);
            
            // if(map.containsKey(to_put))
            // {
            //     map.put(to_put,map.get(to_put)+1);
            // }
            // else
            // {
            //     map.put(to_put,1);
            // }
            map.put(to_put,map.getOrDefault(to_put,0)+1);
            
            
            // else if(map.containsKey(to_put-k) && k==0)
            //     count=count+map.get(to_put-k)-1;
            
           
        }
        System.out.println(map.get(0));
        return count;
        
    }
}

class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count=0;
//         // int[] nums2=new int[nums.length];
//         // nums2[0]=nums[0];
        
//         for(int i=1;i<nums.length;i++)
//         {
//             nums[i]=nums[i-1]+nums[i];
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i;j<nums.length;j++)
//             {
//                 if(i-1>=0 && nums[j]-nums[i]+nums[i]-nums[i-1]==k)
//                 {
//                     System.out.println(i+" "+j);
//                     count++;
//                 }
//                 else if(i-1<0 && nums[j]==k)
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }