package Solution;

/**
 * 输入一棵二叉树，求该树的深度
 * 就是求左子树、右子树的中深度最大的加上一个根节点，依此递归即可
 */
public class Solution_38 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //递归版
    public int TreeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = TreeDepth(root.left)+1;
        int right = TreeDepth(root.right)+1;
        return left>right ? left : right;
    }
}
