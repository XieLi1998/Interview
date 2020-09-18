package 笔试;


import java.util.Scanner;
import java.util.Stack;

/**
 * Created by xieli on 2020/9/16.
 */
public class 天翼云 {


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] dp = new int[2000];
//        int numberOf2 = 0;
//        int numberOf3 = 0;
//        int numberOf5 = 0;
//        dp[0] = 1;
//        for (int i = 1; i < N; i++) {
//            dp[i] = Math.min(dp[numberOf2] * 2, Math.min(dp[numberOf3] * 3, dp[numberOf5] * 5));
//            if (dp[i] == dp[numberOf2] * 2) numberOf2++;
//            if (dp[i] == dp[numberOf3] * 3) numberOf3++;
//            if (dp[i] == dp[numberOf5] * 5) numberOf5++;
//        }
//        System.out.println(dp[N - 1]);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String string = sc.nextLine();
//        char[] chars = string.toCharArray();
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : chars) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        int minTimes = Integer.MAX_VALUE;
//        for (Character c : map.keySet()) {
//            int cur = map.get(c);
//            minTimes = Math.min(minTimes, cur);
//        }
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            if (map.get(chars[i]) == minTimes)
//                continue;
//            res.append(chars[i]);
//        }
//        System.out.println(res.toString());
//    }

    // 本题为考试单行多行输入输出规范示例，无需提交，不计分。

    static Stack<Integer> min = new Stack<>();
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String s = in.nextLine();
            if (s == "pop") {
                pop();
            } else if (s == "top") {
                System.out.println(top());
            } else if (s == "getMin") {
                System.out.println(getMin());
            } else {
                String[] cmd = s.split(" ");
                if (cmd[0] == "push") {
                    push(Integer.valueOf(cmd[1]));
                }
            }
        }
    }

    public static void push(int x) {
        stack.push(x);
        if (min.isEmpty() || min.peek() > x)
            min.push(x);
        else
            min.push(min.peek());
    }

    public static void pop() {
        stack.pop();
        min.pop();
    }

    public static int top() {
        return stack.peek();
    }


    public static int getMin() {
        return min.peek();
    }

}
