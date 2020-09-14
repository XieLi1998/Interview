package 笔试;

import java.util.*;

/**
 * Created by xieli on 2020/9/14.
 */
public class 同城58 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public static int count = 0;
    public static int[][] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        dp = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                dp[i][j] = in.nextInt();
                if (dp[i][j] == 1) {
                    count++;
                }
            }
        }

        int res = 0;
        while (count > 0) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (dp[i][j] == 1) {
                        dfs(i, j);
                        res++;
                    }
                }
            }
        }

        System.out.println(res);
    }

    private static void dfs(int x, int y) {
        if (x < 0 || x >= dp.length || y < 0 || y >= dp[0].length || dp[x][y] != 1)
            return;

        dp[x][y] = 0;
        count--;
        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);
    }

    public int firstMissingPositive(int[] nums) {
        // write code here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                return i;
        }
        return nums.length + 1;
    }

    public ArrayList<ArrayList<Integer>> printNode(TreeNode node) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (node == null)
            return res;
        queue.offer(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
                size--;
            }
            res.add(list);
        }

        return res;
    }

}
