package leetcode_简单;

/**
 * Created by xieli on 2020/9/25.
 */
public class 加一 {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }

}
