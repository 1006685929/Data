package Solution;

/**
 * 跳台阶
 * 对于第n个台阶来说，只能从n-1或者n-2的台阶跳上来
 * F(n) = F(n-1) + F(n-2)
 * 斐波那契问题
 */
public class Solution_08 {

    //迭代处理
    public int JumpFloor(int target) {
        if(target == 0){
            return 0;
        }else if( target == 1){
            return 1;
        }
        if( target == 2 ){
            return 2;
        }
        int i1 = 1;
        int i2 = 1;
        //只把这里改成2就可以了，以为这个序列不是 1 1 2 3 5....了，是 1 2 3 5.... 少了个1
        int count = 2;
        while (count++<=target) {
            int number = i1+i2;
            i1 = i2;
            i2 = number;
        }
        return i2;
    }

    //递归处理
//    public int JumpFloor(int target) {
//     if (target <= 0) {
//     return -1;
//     } else if (target == 1) {
//     return 1;
//     } else if (target ==2) {
//     return 2;
//     } else {
//     return  JumpFloor(target-1)+JumpFloor(target-2);
//     }
//     }
}
