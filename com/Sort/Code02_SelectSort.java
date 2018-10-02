package Sort;


/**
 * 选择排序   每次先找到找最小的
 */
public class Code02_SelectSort {

    public static void sleectSort(int[] arr){
        if (arr == null){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            int minindex = i;//假定小的在i上
            for (int j=i+1;j<arr.length;j++){
                minindex = arr[j]<arr[minindex]?j:minindex;//条件为真取问号后面的
            }
            swap(arr,i,minindex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
}
