class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int max=0;
        int max_i=0;
        int[] arr=new int[26];
        for(int i=0;i<tasks.length;i++)
        {
            char c=tasks[i];
            arr[c-'A']++;
            max=Math.max(arr[c-'A'],max);
            if(max==arr[c-'A'])
            {
                max_i=c-'A';
            }
        }
        
        int num_idles=(max-1)*n;
        // System.out.println(max_i);
        for(int i=0;i<26;i++)
        {
            if(i!=max_i)
            {
                // System.out.println(i);
                num_idles-=Math.min(arr[i],max-1);
            }
        }
        // System.out.println(num_idles);
        if(num_idles<0)
        {
            num_idles=0;
        }
        
        return (tasks.length+num_idles);
        
        
        
    }
}

// class Solution {
//     public int leastInterval(char[] tasks, int n) {
//         int ans=0;
//         Queue<Pair<Integer,Integer>> q=new LinkedList<>();
//         int[] arr=new int[26];
//         for(int i=0;i<tasks.length;i++)
//         {
//             arr[tasks[i]-'A']++;
//         }
//         Arrays.sort(arr);
    
//         for(int i=25;i>=0;i--)
//         {
//             if(arr[i]==0)
//                 break;
//             Pair<Integer,Integer> p=new Pair<Integer,Integer>(i,arr[i]);
//             q.offer(p);
            
            
//             // System.out.println("Pair: "+p.getKey()+","+p.getValue());
            
//         }
        
//         while(q.size()!=0)
//         {
//             Pair<Integer,Integer> p=q.poll();
//             ans++;
//             Pair<Integer,Integer> t_p0=new Pair<Integer,Integer>(p.getKey(),p.getValue()-1);
//             // p.setAt1(p.getValue()-1);
//             p=t_p0;
//             System.out.println("Pair: "+p.getKey()+","+p.getValue());

//             if(p.getValue()>0)
//             {
//                 int temp=n;
//                 while(temp>q.size())
//                 {
//                     Pair<Integer,Integer> t_p=new Pair<Integer,Integer>(-1,-1);
//                     q.offer(t_p);
//                     // temp--;
//                 }
//                 q.offer(p);
//             }
            
//         }
//         return ans;
//     }
// }