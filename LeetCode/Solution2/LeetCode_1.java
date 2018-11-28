package Solution2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hxk
 * 2018/11/19 16:33
 *
 * 用哈希表先把数组中的数字和对应的下标存储一遍，即数字作为键，
 * 下标作为值，存储，当遍历数组的时候用target-nums[i]，得到差k，
 * 然后在map中找是否存在 k，找到即返回k所对应的value,也就是所对应的数组下标
 *
 * 需要注意会错的是要判断一下上面代码中i的值和你找到的数组下标值是否相同
 * 比如{3，2，4} target = 6， 会不会出现返回 0 0 这种错
 *    [2,7,11,15]
 *    [0,1,2, 3]
 */

public class LeetCode_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int v = target-nums[i];
            if (map.containsKey(v) && i!=map.get(v)){
                result[0] = i;
                result[1] = map.get(v);
                return result;
            }
        }
        return result;
    }
}
