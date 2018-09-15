package LinkedList;

public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node(null,null);
        size = 0;
    }

    //判断链表中的元素个数
    public int getSize(){
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return size==0;
    }



    //链表中插入元素
    public void add(int index,E e){
        if (index<0||index>size)
            throw new IllegalArgumentException("add failed");
            Node prev = dummyHead;
            for (int i=0;i<index;i++){
                prev = prev.next;
//                Node node = new Node(e);
//                node.next = prev.next;
//                prev.next = node;
            }
        prev.next = new Node(e,prev.next);
        size++;
    }

    //链表头插入
    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;
        add(0,e);
        size++;
    }

    //链表末尾添加元素
    public void addLast(E e){
        add(size,e);
    }

    //获得链表第index（0-based）个位置的元素
    public E get(int index){
        if (index<0||index>=size)
            throw new IllegalArgumentException("index error");
        Node cur = dummyHead.next;
        for (int i=0;i<index;i++){
            cur = cur.next;
        }
        return cur.e;
    }

    //获得第一个元素
    public E getFirst(){
        return get(0);
    }

    //获得最后一个元素
    public E getLast(){
        return get(size-1);
    }

    //修改链表的第index位置的个元素
    public void set(int index,E e){
        if (index<0||index>=size)
            throw new IllegalArgumentException("index error");
        Node cur = dummyHead.next;
        for (int i=0;i<index;i++){
            cur = cur.next;
            cur.e=e;
        }
    }

    //查找链表中是否存在元素e
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur!=null){
            if (cur.e.equals(e)){
                return true;
            }else{
                cur = cur.next;
            }
        }
        return false;
    }

    //从链表中删除位置为index的元素
    public E remove(int index){

        if (index<0||index>=size)
            throw new IllegalArgumentException("index error");

        Node prev = dummyHead;
        for (int i=0;i<index;i++)
            prev = prev.next;

        Node retNode = prev.next;//retNode是需要删除的节点
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    //从链表中删除第一个元素
    public E removeFirst(){
        return remove(0);
    }
    //从链表中删除最后一个元素

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur!=null){
            res.append(cur+"->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }
}
