package 剑指offer;

/**
 * Created by xieli on 2020/9/1.
 */
public class 数组中重复的数字 {

    //将数组视为哈希表，原地哈希
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] != i) {
                if (nums[nums[i]] == nums[i])
                    return nums[i];
                swap(nums, nums[i], i);
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
