package 剑指offer;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/10/19.
 */
public class 圆圈中最后剩下的数字 {

    public int lastRemaining(int n, int m) {
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
