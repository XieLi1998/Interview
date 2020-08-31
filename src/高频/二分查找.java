package 高频;

/**
 * Created by xieli on 2020/8/31.
 */
public class 二分查找 {

    //704. 二分查找，labuladong 左边界、右边界
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }


    //74. 搜索二维矩阵
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;

        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int temp = matrix[mid / n][mid % n];
            if (temp == target)
                return true;
            else if (temp > target)
                right = mid - 1;
            else if (temp < target)
                left = mid + 1;
        }
        return false;
    }

}
