package Solution;

/**
 * 链表中倒数第k个结点
 * 创建一个栈空间，压入，顺序取出第k个
 */

import java.util.Stack;

public class Solution_14 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<0){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode result = null;
        while (head!=null){   //压栈
            stack.push(head);
            head = head.next;
        }
        if (k>stack.size()){
            return null;
        }
        for (int i=0;i<k;i++){
            result = stack.pop();   //取出
        }
        return result;
    }
}
