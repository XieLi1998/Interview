package leetcode_简单;

/**
 * Created by xieli on 2020/10/4.
 */
public class 只出现一次的数字 {

    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

}
