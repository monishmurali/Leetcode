class Solution {
    public int maxProfit(int[] prices) {
        //consider present day. take two conditions first is for buy that if present price is less than previous day buy and make price[i](present day as buyprice)
        //if present day price is greater than previous day then sell it and find profit price[i]-buyprice and make it as max for first name. second time if arrives check if profit is greater than previous one make that as profit. at last by the end of the array max profit is returned.
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice>prices[i])
            {
                buyprice=prices[i];
            }
            else if(prices[i]-buyprice>maxprofit)
            {
               maxprofit=prices[i]-buyprice;
            }
        }
        return maxprofit;
        
    }
}
