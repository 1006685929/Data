package Solution2;

/**
 * Created by hxk
 * 2018/11/8 15:09
 * 首先新建一个头结点temp，用来代表一个新的链表的头结点
 * 如果A1比B1小，那么temp的下一个节点就指向A1,同时链表A往下移动一个节点
 * 如果比较A1与B1的大小，发现A1比B1大，那么temp的下一个节点就指向B1，同时链表B往下移动一个节点
 */

public class LeetCode_21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode result = temp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        if (l1 == null)
            temp.next = l2;
        if (l2 == null)
            temp.next = l1;
        return result.next;
    }
}
