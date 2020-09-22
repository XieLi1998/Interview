package leetcode_简单;

/**
 * Created by xieli on 2020/9/22.
 */
public class 删除排序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int p = 0, q = 1;
        while (q < nums.length) {
            if (nums[q] != nums[p]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

}
