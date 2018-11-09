package Solution2;

/**
 * Created by hxk
 * 2018/10/31 15:14
 *  x的平方根
 *  二分法逼近，也就是我给出的做法，
 *  除去1，0，因为开根号给出的结果一定是在x的1/2到它本身之间的一个范围，
 *  所以我们初始让min=1，max=本身，每次求MID去逼近
 */

public class LeetCode_69 {
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left<=right) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        mySqrt(8);
    }

}
