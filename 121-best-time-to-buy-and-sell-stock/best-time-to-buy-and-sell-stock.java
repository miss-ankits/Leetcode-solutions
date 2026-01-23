class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=prices[0];int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-buyPrice;
            profit=Math.max(profit,cost);
            buyPrice=Math.min(buyPrice,prices[i]);
        }
        return profit;
    }
}