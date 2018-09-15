package Queue;

public interface Queue<E> {

    int getSize();//获取存放的元素数量
    boolean isEmpty();//判断
    void enqueue(E e);//进队
    E dequeue();//出对
    E getFront();//查看队首元素
}
