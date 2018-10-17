package Solution;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 借助一个队列实现树的层次遍历
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_22 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList arrayList = new ArrayList();
        if (root == null) {
            return arrayList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();//构建树结点
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }
            arrayList.add(treeNode.val);
        }
        return arrayList;
    }

}
