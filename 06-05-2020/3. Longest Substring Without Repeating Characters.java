class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.equals(" "))
        //     return 1;
            
        int[] alpha=new int[1114113];
        Arrays.fill(alpha,-1);
        int st=0;
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            // if(s.charAt(i)==' ')
            //     return 1;
            if(alpha[s.charAt(i)-' ']>=st)
            {
                
                count++;
                if(i==4)
                    System.out.println("sdfsdf "+count);
                count=i-alpha[s.charAt(i)-' '];
                // if(st==0)
                //     count--;
                st=alpha[s.charAt(i)-' ']+1;
                alpha[s.charAt(i)-' ']=i;
                System.out.println("ele "+s.charAt(i)+" if "+count+" la "+alpha[s.charAt(i)-' ']);
            }
            else
            {
                
                alpha[s.charAt(i)-' ']=i;
                count++;
                System.out.println("ele "+s.charAt(i)+" else "+count+" la "+alpha[s.charAt(i)-' ']);
            }
            
            max=Math.max(max,count);
            System.out.println("rr "+max);
        }
        return max;
        
    }
}