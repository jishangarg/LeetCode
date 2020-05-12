class Solution {
    
    List<List<Integer>> ansl=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        int index=0;
        
        backtrack(candidates,index,target,0, new ArrayList<>());
        
        return ansl;
    }
    
    public void backtrack(int[] candidates, int index, int target, int sum, List res)
    {
        System.out.println(res);
        if(index==candidates.length)
        {
            return;
        }
        
        if(sum==target)
        {
            ansl.add(new ArrayList(res));
            System.out.println(res+" l");
            return ;
        }
        if(sum>target)
        {
            return ;
        }
        
        res.add(candidates[index]);
        // sum+=candidates[index];
        backtrack(candidates,index,target,sum+candidates[index],res);
        res.remove(res.size()-1);
        
        // if(index+1<candidates.length){
        //     res.add(candidates[index+1]);
            // sum+=candidates[index];
        //     backtrack(candidates,index+1,target,sum+candidates[index+1],res);
        //     res.remove(res.size()-1);
        // }
        
        // res.add(candidates[index+1]);
        // sum+=candidates[index];
        backtrack(candidates,index+1,target,sum,res);
        // res.remove(res.size()-1);
        
    }
}