package Solution;

/**
 * Created by hxk
 * 2018/11/8 15:26
 */

public class deleteDuplication {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null){
            return null;
        }
        pHead.val = pHead.next.val;
        pHead.next = pHead.next.next;
}
