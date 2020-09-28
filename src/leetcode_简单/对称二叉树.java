package leetcode_简单;

/**
 * Created by xieli on 2020/9/26.
 */
public class 对称二叉树 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

}
