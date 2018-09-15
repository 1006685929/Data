package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//满足可比较性
public class BST<E extends Comparable<E>> {

    //节点类
    private class Node{
        public E e;
        public Node left,right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    //获取存储的元素数量
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //向二分搜索树添加新元素e
    public void add(E e){
       root = add(root,e);
    }

    //向以node为根的二分搜索树种插入元素e，递归算法
    //返回插入新节点后二分搜索树的根
    private Node add(Node node, E e) {

        if (node == null){
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e)<0)
            node.left = add(node.left,e);
        else if (e.compareTo(node.e)>0)
            node.right = add(node.right,e);

        return node;
    }

    //判断二分搜索树中是否包含e
    public boolean contains(E e){
        return contains(root,e);
    }
    //看以node为根的二分搜索树中是否又元素e，递归算法
    private boolean contains(Node node,E e){
        if (node == null)
            return false;

        if (e.compareTo(node.e) == 0)
            return true;
        else if(e.compareTo(node.e)<0)
            return contains(node.left,e);
        else
            return contains(node.right,e);
    }

    //前序遍历
    public void preOrder(){
        preOrder(root);
    }
    //前序遍历以node为根的二分搜索树，递归算法
    private void preOrder(Node node){

        if (node == null)
            return;

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //前序遍历的非递归方法,借用栈
    public void preOrderNR(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);//根节点压入栈
        while (!stack.isEmpty()){
            Node cur = stack.pop();//cur表示当前访问的节点在栈顶
            System.out.println(cur.e);

            if (cur.right!=null)
                stack.push(cur.right);
            if (cur.left!=null)
                stack.push(cur.left);
        }
    }


    //中序遍历
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){

        if (node == null)
            return;

        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    //后序遍历
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null)
            return;

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.e);
    }

//层序遍历
    public void LeveLOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node cur = q.remove();
            System.out.println(cur.e);

            if (cur.left!=null)
                q.add(cur.left);
            if (cur.right!=null)
                q.add(cur.right);
        }
    }

}
