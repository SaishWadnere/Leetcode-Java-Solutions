package Leetcode.array.BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0 ;
        int profit = 0;
        int min =Integer.MAX_VALUE;

        for(int price : prices){
            if( price < min) min=price;

            profit = price - min;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
