package leetcode_简单;

/**
 * Created by xieli on 2020/9/22.
 */
public class 移除元素 {

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (val != nums[fast]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

}
