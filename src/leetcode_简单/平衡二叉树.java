package leetcode_简单;

/**
 * Created by xieli on 2020/9/26.
 */
public class 平衡二叉树 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        helper(root);
        return flag;
    }

    public int helper(TreeNode root) {
        if (root == null || flag == false)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if (Math.abs(left - right) > 1)
            flag = false;
        return Math.max(left, right) + 1;
    }
}
