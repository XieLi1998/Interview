package 笔试;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xieli on 2020/10/18.
 */
public class 浦发笔试测试 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = lastRemaining(n, 3);
        System.out.println(res);
    }

    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

}
