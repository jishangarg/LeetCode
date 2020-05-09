class Solution {
    public int countSubstrings(String s) {
        int count=0;
        //odd 
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;i-j>=0 && i+j<s.length();j++)
            {
                if(s.charAt(i-j)==s.charAt(i+j))
                {
                    count++;
                }
                else
                    break;
            }
        }
        
        System.out.println(count);
        //even
        // System.out.println("rr");
        
            
        for(int i=0;i<s.length()-1;i++)
        {
            System.out.println("rr");
            for(int j=0;i-j>=0 && i+j+1<s.length();j++)
            {
                System.out.println("rr");
                if(s.charAt(i-j)==s.charAt(i+j+1))
                {
                    count++;
                }
                else
                    break;
            }
        }
        
        System.out.println(count);
        return count;
    }
}