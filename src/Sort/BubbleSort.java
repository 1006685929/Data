package Sort;


//冒泡排序
public class BubbleSort {

    private int[] array;

    //构造函数
    public BubbleSort(int[] array){
        this.array = array;
    }

    //打印数组数据
    public void print(){
        for (int arr:array)
            System.out.print(arr+" ");
        System.out.println();
    }

    //冒泡排序
    public void bubSort(){
        for (int i=0;i<array.length-1;i++){//排序轮数
            for (int j=0;j<array.length-1-i;j++){//每轮比较次数
                if (array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //选择排序
    public void SelectionSort(){
        for (int i=0;i<(array.length-1);i++){
            int minIndex = i;
            for (int j=minIndex+1;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    //插入排序
    public void InsertSort(){
        for (int index=1;index<array.length;index++){//外层向右的index，即作为比较对象的数据的index
            int temp = array[index];//用作比较的数据
            int leftindex = index-1;
            while (leftindex>=0&&array[leftindex]>temp){//当必到最左边或者遇到比temp小的数据时结束循环
                array[leftindex+1] = array[leftindex];
                leftindex--;
            }
            array[leftindex+1] = temp;//把temp放在空位置
        }
    }

    //希尔排序
    public void ShellSort(){
        int d = array.length;
        while (true){
            d=d/2;
            for (int x=0;x<d;x++){
                for (int i=x+d;i< array.length;i=i+d){
                    int temp = array[i];
                    int j;
                    for (j=i-d;j>=0&&array[j]>temp;j=j-d){
                        array[j+d]=array[j];
                    }
                    array[j+d]=temp;
                }
            }
            if (d==1){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {33,21,45,58,5,66};
        BubbleSort b = new BubbleSort(array);
        System.out.println("排序前：");
        b.print();
        //b.bubSort();
        //b.SelectionSort();
        //b.InsertSort();
        b.ShellSort();
        System.out.println("冒泡排序后：");
        b.print();
        System.out.println("选择排序后：");
        b.print();
        System.out.println("插入排序后：");
        b.print();
        System.out.println("希尔排序后：");
        b.print();
    }
}
