package Array;
//size所知的位置是数组中第一个元素为空的位置
public class Array {
    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize(){
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e){

//        if(size == data.length)
//            throw new IllegalArgumentException("AddLast failed. Array is full.");
//
//        data[size] = e;
//        size ++;
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e){
        add(0, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e){

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        if(size == data.length)//数组已满
            resize(2*data.length);

        for(int i = size - 1; i >= index ; i --)
            data[i + 1] = data[i];
        data[index] = e;
        size ++;
    }

    //数组扩容
    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data = newData;
    }

    //获取索引位置的元素
    int get(int index){
        if (index<0||index>=size)
            throw new IllegalArgumentException("get fild");
        return data[index];
    }

    //修改index索引位置的元素为e
    void set(int index,int e){
        if (index<0||index>=size)
            throw new IllegalArgumentException("get fild");
        data[index]=e;
    }

    //查找数组中是否存在元素e
    public boolean contains(int e){
        for (int i = 0;i<size;i++){
            if (data[i]==e){
                return true;
            }
        }
        return false;
    }

    //查找数组中是否存在元素e,和他的位置
    public int find(int e){
        for (int i = 0;i<size;i++){
            if (data[i]==e){
                return i;
            }
        }
        return -1;
    }

    //删除指定index位置元素,并返回删除的元素
    public int remove(int index){
        if (index<0||index>=size)
            throw new IllegalArgumentException("get fild");
        //存储要删除的元素
        int ret = data[index];

        for (int i=index+1;i<size;i++){
            data[i-1] =data[i];
        }
        size--;
        if (size==data.length/4&&data.length/2!=0){
            resize(data.length/2);
        }
        return ret;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d,capacity = %d\n",size,data.length));
        res.append('[');
        for (int i = 0;i<size;i++){
            res.append(data[i]);
            if (i!=size-1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}
