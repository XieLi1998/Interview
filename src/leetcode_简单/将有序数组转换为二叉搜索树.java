package leetcode_简单;

/**
 * Created by xieli on 2020/9/26.
 */
public class 将有序数组转换为二叉搜索树 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int lo, int hi) {
        if (lo > hi)
            return null;

        int mid = (lo + hi) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, lo, mid - 1);
        root.right = helper(nums, mid + 1, hi);
        return root;
    }

}
