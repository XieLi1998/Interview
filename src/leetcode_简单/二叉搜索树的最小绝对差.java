package leetcode_简单;

/**
 * Created by xieli on 2020/10/12.
 */
public class 二叉搜索树的最小绝对差 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int preValue = -1;
    int res = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        order(root);
        return res;
    }

    private void order(TreeNode root) {
        if (root == null)
            return;

        /*
            中序遍历：
                计算每轮 上一轮遍历到的节点 和 当前节点 的 差绝对值
         */
        order(root.left);
        if (preValue != -1)
            res = Math.min(Math.abs(root.val - preValue), res);
        preValue = root.val;
        order(root.right);
    }

}
