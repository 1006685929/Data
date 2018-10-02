package Sort;


/**
 * 归并排序,递归
 */
public class Code04_MergeSort {

    public static void Sort(int[] arr,int L,int R){
        if (L==R){
            return;
        }
        int mid = (L+R)/2;//中点
        Sort(arr,L,mid);//  T(N/2)
        Sort(arr,mid+1,R);//  T(N/2)
        mergeSort(arr,L,mid,R);//  O(N)
        //T(N) = 2(N/2)+O(N)
    }

    public static void mergeSort(int[] arr,int L,int mid,int R){
        int[] help = new int[R-L+1];//新建辅助数组
        int i = 0;//辅助数组的i
        int p1 = L;
        int p2 = mid+1;
        while (p1<=mid&&p2<=R){
            //每次都要移动放置
            help[i++] = arr[p1]<arr[p2] ? arr[p1++] : arr[p2++];
        }
        //两个必有且只有一个越界
        while (p1<=mid){
            help[i++] = arr[p1++];
        }
        while (p2<=R){
            help[i++] = arr[p2++];
        }
        //拷贝回去
        for (i = 0;i<help.length;i++){
            arr[L+i] = help[i];
        }
    }
}
