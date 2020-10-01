package leetcode_简单;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieli on 2020/9/29.
 */
public class 杨辉三角II {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    list.add(1);
                else
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(list);
        }

        return res.get(rowIndex);
    }

}
