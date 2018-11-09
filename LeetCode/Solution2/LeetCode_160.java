package Solution2;

/**
 * Created by hxk
 * 2018/11/8 15:16
 * 编写一个程序，找到两个单链表相交的起始节点
 */

public class LeetCode_160 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int ALength = 0;
       int Blength = 0;
       ListNode tempA = headA;
       ListNode tempB = headB;
       while (tempA!=null){
           ALength++;
           tempA = tempA.next;
       }
       while (tempB!=null){
           Blength++;
           tempB = tempB.next;
       }
       tempA = headA;
       tempB = headB;
       if (Blength > ALength){
           int count = Blength-ALength;
           for (int i=0;i<count&&tempB!=null;i++){
               tempB = tempB.next;
           }
       }else {
           int count = ALength -Blength;
           for (int i=0;i<count&&tempA!=null;i++){
               tempA = tempA.next;
           }
       }
       while (tempA!=null && tempB!=null&&tempA!=tempB){
           tempA = tempA.next;
           tempB = tempB.next;
       }
       return tempA;
    }
}
