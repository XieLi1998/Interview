package leetcode_简单;

import java.util.Stack;

/**
 * Created by xieli on 2020/9/22.
 */
public class 有效的括号 {

    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || c != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }

}
