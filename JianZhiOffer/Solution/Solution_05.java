package Solution;

import java.util.Stack;

/**
 * 准备两个栈
 *第一个栈放元素，第二个栈将第一个栈中元素取出放入
 * 第二个栈出栈就是队列顺序
 */
public class Solution_05 {

    public class Solution {

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if (stack2.empty()&&stack1.empty()){
                throw new RuntimeException("Queue id empty");
            }else if (stack2.empty()){
                while (!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }
}
