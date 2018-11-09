package Solution2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by hxk
 * 2018/11/6 16:04
 * 判断回问链表
 */

public class LeetCode_234 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<ListNode> stack = new Stack<>();
        while (fast != null && fast.next != null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null){
            slow = slow.next;
        }
        while (slow != null){
            if (slow.val != stack.pop().val){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
