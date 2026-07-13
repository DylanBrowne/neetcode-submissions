class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length >= 2) {
            int l = 0; //buy
            int r = 1; //sell

            
            //Buy low, sell high

            while (r < prices.length) {
                
                if (prices[l] > prices[r]) {
                    l = r;
                    r++;
                } else if (prices[r] - prices[l] < profit) {
                    r++;
                } else {
                    profit = prices[r] - prices[l];
                    r++;
                }
            }
        }
        return profit;
    }
}
