class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        
        int[][] dp=new int[n+1][m+1];
        for(int i=n;i>=0;i--)
        {
            dp[i][m]=n-i;
            System.out.println(i+" "+m+" "+dp[i][m]);
        }
        for(int i=m;i>=0;i--)
        {
            dp[n][i]=m-i;
            System.out.println(n+" "+i+" "+dp[n][i]);
        }
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(word1.charAt(i)==word2.charAt(j))
                    dp[i][j]=dp[i+1][j+1];
                else
                {
                    dp[i][j]=1+min_fxn(dp[i+1][j],dp[i][j+1],dp[i+1][j+1]);
                }
                System.out.println(i+" "+j+" "+dp[i][j]);
            }
        }
        return dp[0][0];
    }
    
    public int min_fxn(int a, int b, int c)
    {
        int temp=Math.min(a,b);
        return Math.min(temp,c);
    }
}



//class Solution {
//     int dp[][];
//     public int minDistance(String word1, String word2) {
        
//         // int i=0,j=0;
        
//         dp=new int[word1.length()][word2.length()];
//         return min_fxn(0,0, word1,word2);
        
//     }
    
//     public int min_fxn(int i, int j, String s1, String s2)
//     {
//         // if(i==s1.length() && j==s2.length())
//         //     return 1;
        
//         if(j==s2.length())
//         {
//             // System.out.println("ret a "+(s1.length()-i));
//             return s1.length()-i;
//         }
//         if(i==s1.length()){
//             // System.out.println("ret b "+(s2.length()-j));
//             return s2.length()-j;
//         }
//         // if(i<s1.length && j>)
//         if(s1.charAt(i)==s2.charAt(j))
//             return min_fxn(i+1,j+1,s1,s2);
//         if(dp[i][j]!=0)
//             return dp[i][j];
//         int ret= min_util(min_fxn(i,j+1,s1,s2),min_fxn(i+1,j,s1,s2),min_fxn(i+1,j+1,s1,s2)); // insert,delete,replace
//             // System.out.println("ret "+(ret+1));
//         dp[i][j]=ret+1;
//         return ret+1;
//         // return  
//     }
//     public int min_util(int a, int b, int c)
//     {
//         int temp=Math.min(a,b);
//         return Math.min(temp,c);
//     }
// }