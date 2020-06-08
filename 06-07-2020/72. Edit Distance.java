class Solution {
    int dp[][];
    public int minDistance(String word1, String word2) {
        
        // int i=0,j=0;
        
        dp=new int[word1.length()][word2.length()];
        return min_fxn(0,0, word1,word2);
        
    }
    
    public int min_fxn(int i, int j, String s1, String s2)
    {
        // if(i==s1.length() && j==s2.length())
        //     return 1;
        
        if(j==s2.length())
        {
            // System.out.println("ret a "+(s1.length()-i));
            return s1.length()-i;
        }
        if(i==s1.length()){
            // System.out.println("ret b "+(s2.length()-j));
            return s2.length()-j;
        }
        // if(i<s1.length && j>)
        if(s1.charAt(i)==s2.charAt(j))
            return min_fxn(i+1,j+1,s1,s2);
        if(dp[i][j]!=0)
            return dp[i][j];
        int ret= min_util(min_fxn(i,j+1,s1,s2),min_fxn(i+1,j,s1,s2),min_fxn(i+1,j+1,s1,s2)); // insert,delete,replace
            // System.out.println("ret "+(ret+1));
        dp[i][j]=ret+1;
        return ret+1;
        // return  
    }
    public int min_util(int a, int b, int c)
    {
        int temp=Math.min(a,b);
        return Math.min(temp,c);
    }
}