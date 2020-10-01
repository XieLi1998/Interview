package leetcode_简单;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieli on 2020/9/29.
 */
public class 杨辉三角 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    list.add(1);
                else
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(list);
        }

        return res;
    }

}
