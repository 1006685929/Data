package Heap;

public class MaxHeap<Item extends Comparable> {

    protected Item[] data;
    protected int count;
    protected  int capacity;

    //构造函数，构造一个堆，可容纳capacity个元素
    public MaxHeap(int capacity){
        data = (Item[])new Comparable[capacity+1];
        count = 0;
        this.capacity = capacity;
    }

    //返回堆中元素个数
    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    //插入函数
    public void insert(Item item){
        assert count+1<=capacity;//assert是断言，即判断
        data[count+1] = item;
        count++;
        shifUp(count);
    }

    //将k这个索引的元素向上交换
    private void shifUp(int k) {
        while (k>1&&data[k/2].compareTo(data[k])<0){
            swap(k,k/2);
            k/=2;
        }
    }

    //交换
    private void swap(int i, int j) {
        Item t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        int N = 50; // 堆中元素个数
        int M = 100; // 堆中元素取值范围[0, M)
        for( int i = 0 ; i < N ; i ++ )
            maxHeap.insert( new Integer((int)(Math.random() * M)) );
        System.out.println(maxHeap.size());
    }
}
