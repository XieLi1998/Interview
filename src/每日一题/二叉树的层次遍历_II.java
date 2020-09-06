package 每日一题;

import java.util.*;

/**
 * Created by xieli on 2020/9/6.
 */
public class 二叉树的层次遍历_II {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    //107. 二叉树的层次遍历 II
    //二叉树迭代模板
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<List<Integer>>();

        ArrayList<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            res.add(tmp);
        }
        Collections.reverse(res);
        return res;
    }

}
