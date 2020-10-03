package leetcode_简单;

/**
 * Created by xieli on 2020/10/3.
 */
public class 买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices == null)
            return 0;
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }

        return dp[n - 1][0];
    }

}
