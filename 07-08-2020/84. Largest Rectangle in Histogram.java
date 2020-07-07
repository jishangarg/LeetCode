class Solution {
    public int largestRectangleArea(int[] heights) {
        
        
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
                        System.out.println(max_ar+"   "+heights[temp]*(i-s.peek()-1)+"a");
                    }
                    else
                    {
                        max_ar=Math.max(max_ar,heights[temp]*(i));
                        System.out.println(max_ar+"   "+heights[temp]*(i)+"b");
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
                        System.out.println(max_ar+"   "+heights[j]*(i-s.peek()));
                    }
                    else
                    {
                        max_ar=Math.max(max_ar,heights[j]*(i+1));
                        System.out.println(max_ar+"   "+heights[j]*(i+1));
                    }
                }
            }
        
        
        return max_ar;
       
    }
}