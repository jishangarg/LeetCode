class Solution {
    
    public int histogram(int[] heights) {
        
        
        Stack<Integer> s=new Stack<>();
        int max_ar=0;
        
        for(int i=0;i<heights.length;i++)
        {
            if(s.empty() || heights[i-1]<=heights[i])
            {
                s.push(i);
                System.out.println("hk");
            }
            else
            {
                while(!s.empty() && heights[s.peek()]>=heights[i])
                {
                    System.out.println("rr");
                    int temp=s.pop();
                    if(!s.empty())
                    {
                        max_ar=Math.max(max_ar,heights[temp]*(i-s.peek()-1));
                        // System.out.println(max_ar+"   "+heights[temp]*(i-s.peek()-1)+"a");
                    }
                    else
                    {
                        max_ar=Math.max(max_ar,heights[temp]*(i));
                        // System.out.println(max_ar+"   "+heights[temp]*(i)+"b");
                    }
                    
                }
                s.push(i);
            }
        }
            if(!s.empty()){
                int i=s.peek();
                while(!s.empty())
                {
                    int j=s.pop();
                    // max_ar=Math.max(max_ar,heights[j]*(i-s.peek()+1));
                    // System.out.println(max_ar+"   "+heights[j]*(i-j+1)+"c");
                    
                    if(!s.empty())
                    {
                        max_ar=Math.max(max_ar,heights[j]*(i-s.peek()));
                        // System.out.println(max_ar+"   "+heights[j]*(i-s.peek()));
                    }
                    else
                    {
                        max_ar=Math.max(max_ar,heights[j]*(i+1));
                        // System.out.println(max_ar+"   "+heights[j]*(i+1));
                    }
                }
            }
        
        
        return max_ar;
       
    }
    
    public int maximalRectangle(char[][] m) {
        int max_ar=0;
        if(m.length==0)
            return 0;
        int[] arr=new int[m[0].length];
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        
        for(int i=0;i<m[0].length;i++)
        {
            arr[i]=m[m.length-1][i]-48;
            // System.out.println(arr[i]);
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        max_ar=Math.max(max_ar,histogram(arr));
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        for(int i=m.length-2;i>=0;i--)
        {
            for(int j=0;j<m[0].length;j++)
            {
                if(m[i][j]-48!=0)
                {
                    arr[j]=arr[j]+m[i][j]-48;
                }
                else
                {
                    arr[j]=0;
                }
                
                // for(int k=0;k<arr.length;k++)
                // {
                //     System.out.print(arr[k]+" ");
                // }
                // System.out.println();
            }
            max_ar=Math.max(max_ar,histogram(arr));
        }
        return max_ar;
    }
}