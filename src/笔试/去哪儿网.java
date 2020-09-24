package 笔试;

import java.util.Scanner;

/**
 * Created by xieli on 2020/9/23.
 */

public class 去哪儿网 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int top = 1, right = 1;
        for (int i = m - n + 1; i <= m; i++) {
            top *= i;
        }

        for (int i = 2; i <= n; i++) {
            right *= i;
        }

        int res = top / right;
        System.out.println(res);
    }

}
