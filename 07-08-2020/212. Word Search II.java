class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> op=new ArrayList<>();
        for(int x=0;x<words.length;x++)
        {
            String word=words[x];
            int[][] path=new int[board.length][board[0].length];
            for(int i=0;i<board.length;i++)
            {
                int flag=0;
                for(int j=0;j<board[0].length;j++){
                    boolean b=find(i,j,board,word,path);
                    if(b){
                        op.add(word);
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    break;
                // for(int j=0;j<board.length;j++)
                // {
                //     Arrays.fill(path[j],0);
                // }
            }
        }
        return op;
    }
    
    
    
    
    
    
    
    public boolean find(int ele_i,int ele_j, char[][] board,String word,int[][]path)
    {
        if(word.length()==0)
        {
            System.out.println("hk");
            return true;
        }
        
        if(ele_i>=board.length || ele_i<0 || ele_j>=board[0].length || ele_j<0)
            return false;
        
        // int i=ele/board[0].length;
        // int j=ele%board[0].length;
        
        
    // System.out.println(ele+" "+board[i][j]);
        
        
        if(path[ele_i][ele_j]==1)
            return false;
        path[ele_i][ele_j]=1;
        // System.out.println("b "+board[ele_i][ele_j]+" w "+word.charAt(0));
        if(board[ele_i][ele_j]!=word.charAt(0)){
            // System.out.println("rr");
            path[ele_i][ele_j]=0;
            return false;
        }
        else
        {
            boolean ret= (find(ele_i,ele_j+1,board,word.substring(1),path) || find(ele_i+1,ele_j,board,word.substring(1),path) || find(ele_i-1,ele_j,board,word.substring(1),path) || find(ele_i,ele_j-1,board,word.substring(1),path));
            
            // int a=false,b=flase,c=false,d=false;
            // if()
            // find(ele+1,board,word.substring(1));
            // if(!flag)
            //     find(ele+board.length,board,word.substring(1));
            // if(!flag)
            //     find(ele-board.length,board,word.substring(1));
            // if(!flag)
            //     find(ele-1,board,word.substring(1));
            
            if(!ret)
            {
                path[ele_i][ele_j]=0;
            }
            return ret;
        }
    }
}