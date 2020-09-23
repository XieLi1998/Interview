package leetcode_简单;

/**
 * Created by xieli on 2020/9/22.
 */
public class 搜索插入位置 {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        if (target > nums[right])
            return right + 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid])
                return mid;
                //搜索区间是 mid+1,right
            else if (target > nums[mid])
                left = mid + 1;
                //搜索区间是 left,mid
            else if (target < nums[mid])
                right = mid;
        }

        return left;
    }

}
