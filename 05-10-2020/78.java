class Solution {
    List<List<Integer>> ansl=new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        subsetsUtil(nums,0,new ArrayList<Integer>());
        
        return ansl;
    }
    
    public void subsetsUtil(int[] nums, int index, List<Integer> list)
    {
        if(index==nums.length)
        {
            ansl.add(new ArrayList<Integer>(list));
            return;
        }
        
        subsetsUtil(nums,index+1,list);
         
        list.add(nums[index]);
        subsetsUtil(nums,index+1,list);
        list.remove(list.size()-1);
    }
}