package Sort;

/**
 * 堆排序
 * 理解大根堆和小根堆
 * 堆结构可看作在数组上伸缩的二叉树
 */
public class Code08_HeapSort {

    public static void heapSort(int[] arr){
        if (arr==null){
            return;
        }
        //    建立大根堆
        for (int i=0;i<arr.length;i++){
            heapInsert(arr,i); //0-i  初始化大根堆
        }
        int heapSize = arr.length; //heapSize表示数组中堆的大小   --heapsize表示heapsize前一位
        swap(arr,0,--heapSize); //把大根堆中的根和最后一个交换  heapSize减一
        while (heapSize>0){   //直到heepsize==0
            heapify(arr,0,heapSize);//调整出新大根堆
            swap(arr,0,--heapSize); //头和最后一个再交换
        }
    }

    //调整大根堆
    private static void heapify(int[] arr, int index, int heapSize) {
        int left = index*2+1;  //左孩子
        while (left<heapSize){    //下沉操作
            //取左右孩子的最大值的下标largest
            int largest = left+1<heapSize&&arr[left+1]>arr[left] ? arr[left+1] : arr[left];
            //孩子中最大的和自己比较，谁大就作为largest的下标
            largest = arr[largest]>arr[index] ? largest : index;
            if (largest == index){
                break;
            }
            swap(arr,largest,index);  //  if不成立   不相等
            index = largest;          //你变成了你最大孩子的下标
            left = index*2+1;         //  left下移
        }
    }
   //建立调整大根堆
    private static void heapInsert(int[] arr, int index) {
        //循环条件   子节点小于父节点  直到父节点是这棵子树最大的
        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);//交换
            index = (index-1)/2;          //继续向上比较
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }
}
