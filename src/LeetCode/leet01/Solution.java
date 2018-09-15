package LeetCode.leet01;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
       for (int i=0;i<nums.length;i++) {
               //System.out.println(" "+nums[i]);
               for (int j=i+1;j<nums.length;j++){
                   //System.out.print(" "+nums[j]);
                       if (nums[i]+nums[j]==target) {
                           //System.out.println("存在"+nums[i]+"+"+nums[j]+"=target"+" "+i+" "+j);
                           return new int[]{i, j};
                       }
               }
          // System.out.println();
       }
       throw new IllegalArgumentException("not find");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.twoSum(new int[]{2,1,4,6},5);
    }
}
