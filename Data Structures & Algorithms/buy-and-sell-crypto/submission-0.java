class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; //buy
        int r = 1; //sell

        int profit = 0;
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
        return profit;
    }
}
