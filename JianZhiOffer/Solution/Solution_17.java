package Solution;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构
 */
public class Solution_17 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean root = false;//是否开启判断
        if (root1 == null || root2 == null){
            return false;
        }
        //当两个都不为空的时候开启比较
        if (root1.val == root2.val){     //找到了根结点
            root = compare(root1,root2); //开始比较判断
        }
        if (!root){                     //根结点未找到，找左孩子
            root = compare(root1.left,root2);
        }
        if (!root){                     //根结点和左孩子都未找到，找右孩子
            root = compare(root1.right,root2);
        }
        return root;
    }

    private static boolean compare(TreeNode a,TreeNode b) {
        if(b == null){          //如果Tree2已经遍历完了都能对应的上，返回true
            return true;
        }
        if (a == null){         //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
            return false;
        }
        if (a.val != b.val){    //如果其中有一个点没有对应上，返回false
            return false;
        }                        //如果根节点对应的上，那么就分别去子节点里面匹配
        return compare(a.left,b.left)&&compare(a.right,b.right);
    }
}
