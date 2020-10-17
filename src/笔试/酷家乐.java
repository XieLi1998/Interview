package 笔试;

import java.util.Arrays;

/**
 * Created by xieli on 2020/10/17.
 */
public class 酷家乐 {

    public int[] getMax(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int cur = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            res[cur++] = max(nums, i, i + 1, i + 2);
        }
        return res;
    }

    public int max(int[] nums, int a, int b, int c) {
        return Math.max(Math.max(nums[a], nums[b]), nums[c]);
    }

//    public static void main(String[] args) {
//        int[] nums = {1,3,-1,-3,5,3,6,7};
//
//        System.out.println(Arrays.toString(getMax(nums,3)));
//    }

}
