package Solution2;

/**
 * Created by hxk
 * 2018/10/30 16:28
 * 寻找重复数
 */

public class LeetCode_287 {

    //双指针
    public int findDuplicate(int[] nums) {
        for (int i=0;i<nums.length;i++){
            int left = i-1;
            int right = i+1;
            while (left>=0){
                if (nums[left]==nums[i]){
                    System.out.println(nums[left]);
                    System.out.println(left);
                    return nums[left];
                }
                left--;
            }
            while (right<nums.length-1){
                if (nums[right]==nums[i]){
                    System.out.println(nums[right]);
                    System.out.println(right);
                    return nums[right];
                }
                right++;
            }
        }
        return -1;
    }

    //二分查找

    public int findDuplicate2(int[] nums) {
        int low = 1;
        int high = nums.length;
        int mid = low + (high - low) / 2;
        while (low < high) {
            int count = 0;
            mid = low + (high - low) / 2;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;//1 2 3 3 4
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        LeetCode_287 l = new LeetCode_287();
        int[] arr = {3,1,3,4,5,2};
        l.findDuplicate(arr);
    }
}
