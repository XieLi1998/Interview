package leetcode_简单;

/**
 * Created by xieli on 2020/10/11.
 */
public class 两数之和II输入有序数组 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target)
                i++;
            else if (sum > target)
                j--;
            //此处必须注意坐标
            else
                return new int[]{i + 1, j + 1};
        }
        return new int[]{-1, -1};
    }

}
