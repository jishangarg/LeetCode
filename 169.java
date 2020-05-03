class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>n/2)
                {
                    return nums[i];
                    // System.out.println(nums[i]);
                    // map.put(map.get(nums[i]),-99999999);
                }
            }
            else
            {
                map.put(nums[i],1);
                if(map.get(nums[i])>n/2)
                    return nums[i];
            }
        }
        return 0;
    }
}

//other soln??