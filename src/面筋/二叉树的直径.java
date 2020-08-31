package 面筋;

/**
 * Created by xieli on 2020/8/30.
 */
public class 二叉树的直径 {

    //543. 二叉树的直径
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int maxDepth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDepth;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        //将每个节点最大直径(左子树深度+右子树深度)当前最大值比较并取大者
        maxDepth = Math.max(maxDepth, left + right);
        //返回节点深度
        return Math.max(left, right) + 1;
    }

}
