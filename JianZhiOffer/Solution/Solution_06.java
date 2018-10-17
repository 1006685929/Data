package Solution;

/**
 * 二分查找
 * 第一种情况：array[mid] > array[high]   此时最小值一定在mid右侧
 * 第二种情况：array[mid] == array[high]  此时最小数字不好判断在mid左边还是右边,这时只好一个一个试
 * 第一种情况：array[mid] < array[high]    此时最小数字一定就是array[mid]或者在mid的左边
 */
public class Solution_06 {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0)
            return 0;
        int left = 0;
        int right = len - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(array[mid] > array[right]){
                left = mid + 1;
            }else if(array[mid] == array[right]){
                right = right - 1;
            }else{
                right = mid;//特殊情况，数组中只有两个数
            }
        }
        return array[left];
    }
}
