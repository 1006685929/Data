package Solution;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * 先前序遍历这棵树的每个节点
 * 如果遍历到的节点有子节点，就交换它的两个子节点
 * 当交换完所有非叶节点的左、右子节点之后，就得到了树的镜像
 */
public class Solution_18 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode root) {
       if (root == null||root.left==null&&root.right==null){
           return;
       }
       //交换左右子树
       TreeNode temp = root.left;
       root.left = root.right;
       root.right = temp;
       //递归交换
       if (root.left!=null){
           Mirror(root.left);
       }
       if (root.right!=null){
           Mirror(root.right);
       }
    }
}
