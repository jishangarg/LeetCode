class Solution {
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        // int[][] dp=new int[m][n];
        
        // dp[0][0]=grid[0][0];
        for(int i=1;i<grid.length;i++)
        {
            grid[i][0]=grid[i][0]+grid[i-1][0];
        }
        
        for(int j=1;j<grid[0].length;j++)
        {
            grid[0][j]=grid[0][j]+grid[0][j-1];
        }
        
        for(int i=1;i<grid.length;i++)
        {
            for(int j=1;j<grid[i].length;j++)
            {
                grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        
        return grid[m-1][n-1];
        
    }
}