package leetcode_简单;

/**
 * Created by xieli on 2020/9/25.
 */
public class 外观数列 {

    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder();
        int p1 = 0, cur = 1;
        if (n == 1)
            return "1";

        String str = countAndSay(n - 1);
        for (cur = 1; cur < str.length(); cur++) {
            if (str.charAt(cur) != str.charAt(p1)) {
                int count = cur - p1;
                res.append(count).append(str.charAt(p1));
                p1 = cur;
            }
        }

        if (p1 != cur) {
            int count = cur - p1;
            res.append(count).append(str.charAt(p1));
        }

        return res.toString();
    }

}
