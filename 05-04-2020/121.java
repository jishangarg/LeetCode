class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0 || prices.length==1)
        {
            return 0;
        }
        int max=prices[prices.length-1],mp=0;
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]>max)
            {
                max=prices[i];
            }
            else
            {
                if(mp<max-prices[i])
                {
                    mp=max-prices[i];
                }
            }
            // System.out.println(mp);
        }
        return mp;
        
    }
}