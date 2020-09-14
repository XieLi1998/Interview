package leetcode;

import java.util.Stack;

/**
 * Created by xieli on 2020/9/14.
 */
public class 计算器 {

    public int calculate(String s) {
        char[] chars = s.trim().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int res = 0, idx = 0;
        while (idx < chars.length) {
            if (chars[idx] == ' ') {
                idx++;
                continue;
            }
            char temp = chars[idx];
            if (temp == '*' || temp == '/' || temp == '+' || temp == '-') {
                idx++;
                while (idx < chars.length && chars[idx] == ' ') {
                    idx++;
                }
            }

            int num = 0;
            while (idx < chars.length && Character.isDigit(chars[idx])) {
                num = num * 10 + chars[idx] - '0';
                idx++;
            }

            switch (temp) {
                case '-':
                    num = -num;
                    break;
                case '*':
                    num = stack.pop() * num;
                    break;
                case '/':
                    num = stack.pop() / num;
                    break;
                default:
                    break;
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

}
