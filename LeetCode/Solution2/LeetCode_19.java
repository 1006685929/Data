package Solution2;

/**
 * Created by hxk
 * 2018/11/9 15:46
 */

public class LeetCode_19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //添加一个头节点，只需要快指针先走n+1步即可
    //快指针到末尾时，慢指针就到要删除的节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(-1);
        ListNode fast = start;
        ListNode slow = start;
        slow.next = head;
        //快指针先走n+1
        for (int i=1 ;i<n+1;i++){
            fast = fast.next;
        }
        //开始同时走
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
