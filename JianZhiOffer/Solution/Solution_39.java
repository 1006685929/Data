package Solution;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 * 递归思路
 */
public class Solution_39 {

    public static class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }
    }

    //主方法
    public boolean IsBalanced_Solution(TreeNode root) {
        return process(root).isB;
    }

    //返回是否平衡和高度
    public static class ReturnData{
        public boolean isB;
        public int h;

        public ReturnData(boolean isB, int h) {
            this.isB = isB;
            this.h = h;
        }
    }

    public static ReturnData process(TreeNode head){
        if(head == null){
            return new ReturnData(true,0);
        }
        ReturnData leftData = process(head.left);//假设拿到返回的平衡信息
        if (!leftData.isB){
            return new ReturnData(false,0);
        }
        ReturnData rightData = process(head.right);
        if (!rightData.isB){
            return new ReturnData(false,0);
        }
        if (Math.abs(leftData.h-rightData.h) > 1 ){
            return new ReturnData(false,0);
        }
        return new ReturnData(true,Math.max(leftData.h,rightData.h)+1);
    }
}
