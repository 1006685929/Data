package Solution2;

/**
 * Created by hxk
 * 2018/11/22 15:23
 * 双指针法
 */

public class LeetCode_26 {
    public static int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        int i=0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        LeetCode_26.removeDuplicates(nums);
    }
}
