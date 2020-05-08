class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ansl=new ArrayList<>(); 
        parenUtil("",n,n,ansl);
        return ansl;
    }
    
    public void parenUtil(String res,int o, int c,List<String> ansl)
    {
        if(o==0 && c==0)
        {
            ansl.add(res);
            return;
        }
        
        if(o==c)
        {
            // res=res+"(";
            parenUtil(res+"(",o-1,c,ansl);
        }
        else if(o>=0 && o<c)
        {
            parenUtil(res+"(",o-1,c,ansl);
            parenUtil(res+")",o,c-1,ansl);
            
        }
    }
}