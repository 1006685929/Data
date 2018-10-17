package Solution;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 递归处理
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 前序遍历序列化，遇到null用#中间间隔用！
 * 反序列化将序列化数据放入队列，依次拿出加以处理
 */
public class Solution_61 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    //先序 序列化
    String Serialize(TreeNode root) {
        if(root == null){
            return "#!";
        }
        String res = root.val+"!";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return res;
    }

    //放入队列
    TreeNode Deserialize(String str) {
        String[] values = str.split("!");
        Queue<String> queue = new LinkedList<>();
        for (int i = 0;i!=values.length;i++){
            queue.offer(values[i]);
        }
        return reconPre(queue);
    }

    //用队列建立整棵树
    private TreeNode reconPre(Queue<String> queue) {
        String value = queue.poll();//从中拿出一个value，并删除此数据
        if (value.equals("#")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(value));//不为空，消费value，建立head（root）
        root.left = reconPre(queue);
        root.right = reconPre(queue);
        return root;
    }


}
