package Solution;

/**
 * 矩形覆盖
 * 依旧是斐波那契
 * 底层只有俩种，找规律·
 * 要么一次加1，要么一次加2
 *  f(n) = f(n-1) + f(n-2)， (n > 2)
 */
public class Solution_10 {

    public int RectCover(int target) {
        if(target<1){
            return 0;
        }
        if (target==1||target==2){
            return target;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }
    }

//    public int RectCover(int target) {
//        int tempNum = 1;
//        int result = 2;
//
//        if (target == 0) {
//            return 0;
//        }
//
//        if (target == 1 || target == 2) {
//            return target;
//        }
//
//        int count = 2;
//        while (count < target) {
//            result += tempNum;
//            tempNum = result - tempNum;
//            count ++;
//        }
//        return result;
//    }

}
