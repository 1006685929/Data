package Sort;

import java.util.Arrays;

public class MergeSort {
    /**
     * 归并排序
     * 将两个或者两个以上的有序表合并成一个新的有序表，即把待排序的序列分成若干个子序列
     * 每个序列是有序的，然后把有序序列合并成整体有序序列
     */

    //递归使用归并排序，对nums[low...high]的范围进行排序
    public static int[] sort(int[] nums,int low,int high){
        int mid = (low+high)/2;
        if (low<high){
            sort(nums,low,mid);//处理左边
            sort(nums,mid+1,high);//处理右边
            merge(nums,low,mid,high);//左右归并
        }
        return nums;
    }

    //将nums[low...mid]和nums[mid+1...high]两部分进行归并
    private static void merge(int[] nums, int low, int mid, int high) {
        //定义一个辅助数组，空间复杂度O(n)
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        //找出较小的元素放入temp数组中
        while (i<=mid&&j<=high){
            if (nums[i]<nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }
        while (i<=mid){
            temp[k++] = nums[i++];
        }
        while (j<=high){
            temp[k++] = nums[j++];
        }
        //使用temp中的元素覆盖nums中的元素
        for (int k2=0;k2<temp.length;k2++){
            nums[k2+low] = temp[k2];
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,7,5,9,0,1,6};
        System.out.println(Arrays.toString(nums));
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
