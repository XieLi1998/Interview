package leetcode_简单;

import java.util.Stack;

/**
 * Created by xieli on 2020/10/11.
 */
public class 最小栈 {

    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x < minStack.peek())
                minStack.push(x);
            else
                minStack.push(minStack.peek());
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

}
