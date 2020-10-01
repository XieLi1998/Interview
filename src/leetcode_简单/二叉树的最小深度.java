package leetcode_简单;

/**
 * Created by xieli on 2020/9/29.
 */
public class 二叉树的最小深度 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null || root.right == null)
            return left + right + 1;

        return Math.min(left, right) + 1;
    }

}
