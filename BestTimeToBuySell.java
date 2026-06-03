class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minimumBuy = prices[0];
        for(int i=1; i<prices.length; i++){
            int cost = prices[i] - minimumBuy;
            maxProfit = Math.max(maxProfit,cost);
            minimumBuy = Math.min(minimumBuy,prices[i]);
        }
        return maxProfit;
    }
}