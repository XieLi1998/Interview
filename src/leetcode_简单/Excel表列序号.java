package leetcode_简单;

/**
 * Created by xieli on 2020/10/11.
 */
public class Excel表列序号 {

    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            res = res * 26 + num;
        }
        return res;
    }

}
