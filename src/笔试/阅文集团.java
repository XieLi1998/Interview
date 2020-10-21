package 笔试;

import java.util.Scanner;

/**
 * Created by xieli on 2020/10/21.
 */
public class 阅文集团 {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public TreeNode nearestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // write code here
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = nearestCommonAncestor(root.left, p, q);
        TreeNode right = nearestCommonAncestor(root.right, p, q);
        if (left == null)
            return right;
        if (right == null)
            return left;

        return root;
    }

    public static String removeDuplicatedChars(String str) {
        // write code here
        int len = str.length();
        char[] chars = str.toCharArray();
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                res += chars[i];
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j])
                        chars[j] = ' ';
                }
            }
        }
        return res;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean flag = true;
//        if (n == 2) {
//            flag = true;
//            System.out.println(flag);
//            return;
//        }
//        if (n < 2 || n % 2 == 0) {
//            flag = false;
//            System.out.println(flag);
//            return;
//        }
//
//        for (int i = 3; i < Math.sqrt(n); i += 2) {
//            if (n % i == 0)
//                flag = false;
//        }
//        System.out.println(flag);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] str = string.split(",");
        int m = Integer.valueOf(str[0]);
        int n = Integer.valueOf(str[1]);
        int p = Integer.valueOf(str[2]);

        int[][] dp1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }

}
