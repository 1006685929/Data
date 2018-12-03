package Solution;

/**
 * 变态跳台阶
 * 分析可得f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(n-(n-1)) + f(n-n)
 *            | 1       ,(n=0 )
 * f(n) =     | 1       ,(n=1 )
 *            | 2*f(n-1),(n>=2)
 */
public class Solution_09 {

    public int JumpFloorII(int target) {
        if (target <= 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
