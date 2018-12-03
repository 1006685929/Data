package Solution;

import java.util.Stack;

/**
 * 两个栈，一个进栈时放全部元素，另一个放最小的一个
 */
public class Solution_20 {

    Stack<Integer> stack1 = new Stack<>();//放全部数
    Stack<Integer> stack2 = new Stack<>();//进栈时比对放最小的一个
    int min = Integer.MAX_VALUE;
    public void push(int node) {
       stack1.push(node);
       if (node<min){
           stack2.push(node);
           min = node;
       }else {
           stack2.push(min);
       }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
