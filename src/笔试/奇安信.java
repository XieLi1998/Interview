package 笔试;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by xieli on 2020/10/18.
 */
public class 奇安信 {

    public int maxValue(int[][] matrix) {
        // write code here
        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0)
                    dp[i][j] = dp[i][j - 1] + matrix[i][j];
                else if (j == 0)
                    dp[i][j] = dp[i - 1][j] + matrix[i][j];
                else
                    dp[i][j] = matrix[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[matrix.length - 1][matrix[0].length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal res = new BigDecimal(1);
        for (int i = 2; i <= n; i++) {
            BigDecimal multiple = new BigDecimal(i);
            res = res.multiply(multiple);
        }
        System.out.println(res);
    }

}
