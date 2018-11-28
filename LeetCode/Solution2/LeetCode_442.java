package Solution2;

import Queue.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hxk
 * 2018/11/15 15:33
 */

public class LeetCode_442 {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        LeetCode_442.findDuplicates(arr);
    }

//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        if (nums == null){
//            return null;
//        }
//        Arrays.sort(nums);
//        for (int i=0;i+1<=nums.length-1;i++){
//            if (nums[i]==nums[i+1]){
//                list.add(nums[i]);
//            }
//        }
//        return list;
//    }
}
