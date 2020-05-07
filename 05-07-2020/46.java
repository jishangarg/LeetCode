class Solution {
    List<List<Integer>> ansl=new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {

        int depth=0,index=0;
        int[] used=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            used[i]=1;
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            res.add(0);
        }
        
        dfs(nums,depth,res,used);
        for (int i = 0; i < ansl.size(); i++)
        {
            for (int j = 0; j < ansl.get(i).size(); j++)
            {
                System.out.print(ansl.get(i).get(j)+" ");
            } 
            System.out.println();
        }
        return ansl;
        
    }
    
    public  void dfs(int[] nums,int depth,ArrayList<Integer> res,int[] used)
    {
        if(depth==nums.length)
        {
            ansl.add(new ArrayList<Integer>());
            
            for(int y=0;y<res.size();y++)
            {
                ansl.get(ansl.size()-1).add(0);
                ansl.get(ansl.size()-1).set(y,res.get(y));
            }
            
            System.out.println("end");
            for(int m: res)
            {
                System.out.print(m+" ");
            }
            System.out.println("here only");
            
            for (int i = 0; i < ansl.size(); i++)
        {
            for (int j = 0; j < ansl.get(i).size(); j++)
            {
                System.out.print(ansl.get(i).get(j)+" ");
            } 
            System.out.println();
        }
            
            
            return;
        }
    
        // System.out.println(used);
        for (int element: used) {
            System.out.print(element+" ");
        }
        System.out.println();
    
        for(int i=0;i<nums.length ;i++)
        {
            System.out.println("rr");
            if(used[i]!=0)
            {
                System.out.println("depth "+depth+" no. "+nums[i]);
                
                res.set(depth,nums[i]);
                int[] uc=new int[used.length];
                for(int z=0;z<used.length;z++)
                {
                    uc[z]=used[z];
                }
                uc[i]=0;
                // int[] uc=used.clone();
                // uc[i]=0;
                dfs(nums,depth+1,res,uc);

            }
        }
    }
}