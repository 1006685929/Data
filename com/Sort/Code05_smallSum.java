package Sort;


/**
 * 小和问题
 * 在一个数组中，每一个数左边比当前数小的累加起来，叫做这个数组的小和
 * 配合归并排序算法
 */
public class Code05_smallSum {

    public static int mergeSort(int[] arr,int l,int r){

        //不能再二分了
        if (l == r){
            return 0;
        }
        int mid = l+(r-l)>>1;//(l+r)/2  位运算快速
        return mergeSort(arr,l,mid)+       //左半边部分的小和
                mergeSort(arr,mid+1,r)+   //右半边部分的小和
                merge(arr,l,mid,r);          //整体排序后的小和
    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[(r-l+1)];//归并  辅助数组
        int i = 0;
        int p1 = l;
        int p2 = mid+1;
        int res = 0;
        while (p1<=mid&&p2<=r){
            //多少个大于p1的就用个数*p1  统计
            res += arr[p1]<arr[2] ? (r-p2+1)* arr[p1] : 0;
            help[i++] = arr[p1]<arr[p2] ? arr[p1++] : arr[p2++];
        }
        //两个必有且只有一个越界
        while (p1<=mid){
            help[i++] = arr[p1++];
        }
        while (p2<=r){
            help[i++] = arr[p2++];
        }
        //拷贝回去
        for (i = 0;i<help.length;i++){
            arr[l+i] = help[i];
        }
        return res;
    }
}
