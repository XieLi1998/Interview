package 面筋;

/**
 * Created by xieli on 2020/8/30.
 */
public class 平衡树判定 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeNode node) {
        if (node == null || !isBalanced)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return Math.max(left, right) + 1;
    }

}
