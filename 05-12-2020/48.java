class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    swap(matrix,i,j,j,i);
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                swap(matrix,i,j,i,n-1-j);
            }
        }
    }
    
    public void swap(int[][] matrix, int i, int j,int k, int l)
    {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[k][l];
        matrix[k][l]=temp;
    }
}