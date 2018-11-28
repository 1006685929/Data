package Solution2;

/**
 * Created by hxk
 * 2018/11/23 17:24
 */

public class LeetCode_27 {
    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        int i = 0;
        for (int j=0;j<len;j++){
            if (nums[j]!=val){
                nums[i] =nums[j];
                i++;
            }
        }
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        removeElement(a,3);
    }
}
