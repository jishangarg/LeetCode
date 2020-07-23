class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0)
            return 0;
        
        Stack<Integer> stack=new Stack();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else if(s.charAt(i)==')')
            {
                if(!stack.empty() && s.charAt(stack.peek())=='(')
                {
                    stack.pop();
                }
                else
                    stack.push(i);
            }
        }
        if(stack.empty())
            return s.length();
        
        if(stack.size()==1)
        {
            int ele=stack.pop();
            return Math.max(ele,s.length()-ele-1);
        }
        int max=Integer.MIN_VALUE;
        // System.out.println(stack.size());
        max=Math.max(s.length()-1-stack.peek(),max);
        while(stack.size()>1)
        {
            // System.out.println(max);
            int temp=stack.pop();
            System.out.println(temp-stack.peek()-1);
            max=Math.max(max,temp-stack.peek()-1);
        }
        max=Math.max(stack.peek(),max);
        
        return max;
        
    }
}