package LeetCode.leet203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        //判断head是否为需要删除的节点
        //while循环是为了防止删除一个头节点后，下一个头节点也是要删除的元素
        while (head!=null&&head.val==val){
//            ListNode delNode = head;
//            head = head.next;
//            delNode.next = null;
            head = head.next;
        }

        if (head ==null)
            return null;

        ListNode prev = head;
        while (prev.next!=null){
            if (prev.next.val==val){
                prev.next=prev.next.next;
            }
            else {
                prev = prev.next;
            }
        }
        return head;
    }

}
