package leetcode50;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int temp = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < temp) {
                temp = prices[i];
            }else {
                maxProfit = Math.max(maxProfit, prices[i] - temp);
            }
        }
        return maxProfit;
    }
}
