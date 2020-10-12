package leetcode_简单;

/**
 * Created by xieli on 2020/10/12.
 */
public class 阶乘后的零 {

    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

}
