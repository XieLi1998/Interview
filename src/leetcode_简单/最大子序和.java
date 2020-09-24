package leetcode_简单;

/**
 * Created by xieli on 2020/9/25.
 */
public class 最大子序和 {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(sum, res);
        }
        return res;
    }

    //动态规划
    public int maxSubArrayV2(int[] nums) {
        int sum = 0, res = nums[0];
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            res = Math.max(sum, res);
        }
        return res;
    }

}
