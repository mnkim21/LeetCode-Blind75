class Solution {
    public int maxProfit(int[] prices) {
        /*
        two pointer
        buy & sell -> nested for loop
        save profit -> compare

        ex> prices = [7,1,5,3,6,4] -> length : 6
        */

        // FAIL : Time Limit Exceeded
        // int profit = 0;

        // for(int i = 0; i < prices.length - 1; i++) { // buy; 0; 0 1 2 3 4
        //     for(int y = i + 1; y < prices.length; y++) { // sell; 1; 1 2 3 4 5
        //         int testProfit = prices[y] - prices[i];
        //         if(prices[i] < prices[y] && profit < testProfit) {
        //             profit = testProfit;
        //         }
        //     }
        // }
        // return profit;

        int buy = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            if(buy > sell) {
                buy = sell;
            } else if (sell - buy > profit) {
                profit = sell - buy;
            }
        }
        return profit;
    }
}