package 笔试;

import java.util.Scanner;

/**
 * Created by xieli on 2020/9/18.
 */
public class 平安科技 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int top = max3(a + b, b, c);
        int left = max3(a, b + c, c);
        int right = max3(a, b, b + c);
        double res = top * 0.1 / (left + right);
        res = Math.round(res * 100) / 100.0;
        System.out.println(res);
    }


    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] dp = new int[500];
//        dp[0] = 1;
//        dp[1] = 2;
//        dp[2] = 3;
//        dp[3] = 4;
//        int increment = 2;
//        for (int i = 4; i < n; i++) {
//            dp[i] = dp[i - 1] + increment;
//            increment++;
//        }
//        System.out.println(dp[n - 1]);
//    }

}
