package leetcode_简单;

/**
 * Created by xieli on 2020/9/22.
 */
public class 实现strStr {

    //通用牛逼版之 KMP 算法
    public int strStr(String txt, String pat) {
        if (pat.equals(""))
            return 0;
        if (txt.equals(""))
            return -1;

        int M = pat.length();
        int[][] dp = new int[M][256];
        int X = 0;
        dp[0][pat.charAt(0)] = 1;
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < 256; j++) {
                dp[i][j] = dp[X][j];
            }
            dp[i][pat.charAt(i)] = i + 1;
            X = dp[X][pat.charAt(i)];
        }

        int j = 0;
        for (int i = 0; i < txt.length(); i++) {
            j = dp[j][txt.charAt(i)];
            if (j == M)
                return i - M + 1;
        }

        return -1;
    }

    public int strStrV2(String txt, String pat) {
        int L = pat.length();
        int n = txt.length();

        for (int start = 0; start < n - L + 1; start++) {
            if (txt.substring(start, start + L).equals(pat))
                return start;
        }

        return -1;
    }

}
