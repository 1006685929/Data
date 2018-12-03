package Solution;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 合并两个排序的链表
 */
public class Solution_16 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    //非递归
    //两个节点，root不动，head移动，最后返回root.next
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);//创建一个新节点存新的顺序-1避免为空
        head.next = null;
        ListNode root = head;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            }else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }
        if (list1!=null){
            head.next = list1;
        }
        if (list2!=null){
            head.next = list2;
        }
        return root.next;
    }

    //递归
    public ListNode Merge2(ListNode list1,ListNode list2) {

        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }
        ListNode pre = null;
        if (list1.val<=list2.val){
            pre = list1;
            pre.next = Merge2(list1.next,list2);
        }else {
            pre = list2;
            pre.next = Merge2(list1,list2.next);
        }
        return pre;
    }
}
