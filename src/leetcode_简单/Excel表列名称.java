package leetcode_简单;

/**
 * Created by xieli on 2020/10/11.
 */
public class Excel表列名称 {

    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            n -= 1;
            res.append((char) ('A' + n % 26));
            n /= 26;
        }
        return res.reverse().toString();
    }



}
