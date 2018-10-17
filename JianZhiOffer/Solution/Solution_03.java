package Solution;

import java.util.ArrayList;

/**
 * 先将链表反转
 * 再将链表的数值遍历插入数组
 */
public class Solution_03 {

    public class ListNode{
         int val;
         ListNode next = null;

         ListNode(int val){
            this.val = val;
        }
    }

    //listNode指向头节点   head
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list =new ArrayList();
        ListNode pre = null;
        ListNode next = null;
        while (listNode!=null){
            next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;
        }
        while (pre!=null){
            list.add(pre.val);
            pre = pre.next;
        }
       return list;
    }

}
