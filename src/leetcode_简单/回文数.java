package leetcode_简单;

/**
 * Created by xieli on 2020/9/22.
 */
public class 回文数 {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int cur = 0, num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }

}
