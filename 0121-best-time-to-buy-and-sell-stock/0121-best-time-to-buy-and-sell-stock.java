class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int buy_price=prices[0];

        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy_price){
                max_profit=Math.max(max_profit,prices[i]-buy_price);
            }
            buy_price=Math.min(buy_price,prices[i]);
        }        
        return max_profit;
    }
}