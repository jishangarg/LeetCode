class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(Integer num: nums)
        {
            set.add(num);
        }
        
        int max=0;
        for(Integer num:nums)
        {
            int this_seq=0;
            if(!set.contains(num-1))
            {
                this_seq++;
                
                while(set.contains(num+1))
                {
                    this_seq++;
                    num++;
                }
                max=Math.max(max,this_seq);
            }
        }
        return max;
    }
}