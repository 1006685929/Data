package Sort;

/**
 * 经典快速排序优化版  随机快排
 * 将数组分块使左边的都小于x，右边的都大于等于x，重复递归，不断把小块排序
 */
public class Code07_quickSort {

    public static void quickSort(int[] arr,int L,int R){

        if (L<R){
            //随机快排添加代码，即在L到R位置上随机一个值和R交换，作为指定值
            swap(arr,L+(int)(Math.random()*(R-L+1)),R);
            int[] p = patrition(arr,L,R);//记录边界，后续递归区域选择，左边完了处理右边
            quickSort(arr,L,p[0]-1);
            quickSort(arr,p[1+1],R);
        }
    }

    private static int[] patrition(int[] arr, int L, int R) {

        int Less = L - 1;
        int more = R;
        while (L < R) {
            if (arr[L] < arr[R]) {  //比较   小于·部分·扩大
                swap(arr, ++Less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr, more, R);//将后边存放x区域的x和大于x部分的区域交换，即=x的部分++
        return new int[]{Less + 1, more};//两个长度的数组
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
