package Solution2;

/**
 * Created by hxk
 * 2018/11/11 16:08
 * 快节点是慢节点的多少倍，快节点就通过多少圈与慢节点相遇
 * 所以就根据相遇点距环入口的距离等于头节点距环入口的距离
 */

public class LeetCode_142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){ //判断是否为环
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode slow2 = head;//开始从头节点一起移动
                while (slow2 != slow){ //相遇的时候就是入口
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}
