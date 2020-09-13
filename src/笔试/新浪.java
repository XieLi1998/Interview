package 笔试;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by xieli on 2020/9/13.
 */
public class 新浪 {
    public class ListNode {
        int val;
        ListNode next = null;
    }

    public int isLinkedListPalindromic(ListNode startNode) {
        // write code here
        int idx = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (startNode != null) {
            map.put(idx, startNode.val);
            idx++;
            startNode = startNode.next;
        }
        int cur = 0;
        idx -= 1;
        while (cur < idx) {
            if (map.get(cur) != map.get(idx)) {
                return 0;
            }
            cur++;
            idx--;
        }
        return 1;
    }

    public static int getTimes(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;
        return getTimes(n - 1) + getTimes(n - 2) + getTimes(n - 3);
    }

    public static int getTimesV2(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

//    public static void main(String[] args) {
//        System.out.println(getTimes(7));
//        System.out.println(getTimesV2(7));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[10];
        int idx = 0;
        while (sc.hasNextLine()) {
            dp[idx++]=sc.nextInt();
        }
        System.out.println("good");
    }

}
