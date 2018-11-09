package Solution2;

/**
 * Created by hxk
 * 2018/11/2 15:25
 * 只需用下一个节点内容赋值替代本节点即可，
 * 因为替代后本节点直接链接下下个节点，无需再额外删除下一个节点的内容
 */

public class LeetCode_237 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public void deleteNode(ListNode node) {
        if (node == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
