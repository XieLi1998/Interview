package leetcode_简单;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieli on 2020/9/24.
 */
public class 二叉搜索树中的众数 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> maxList = new ArrayList<>();
    int count = 0;
    int current = 0;
    int maxCount = 0;

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] res = new int[maxList.size()];
        for (int i = 0; i < maxList.size(); i++) {
            res[i] = maxList.get(i);
        }
        return res;
    }

    public void inOrderTraversal(TreeNode node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);

        int nodeValue = node.val;
        if (nodeValue == current) {
            count++;
        } else {
            current = nodeValue;
            count = 1;
        }

        if (count == maxCount) {
            maxList.add(nodeValue);
        } else if (count > maxCount) {
            maxList.clear();
            maxList.add(nodeValue);
            maxCount = count;
        }

        inOrderTraversal(node.right);
    }

}
