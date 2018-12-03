package Solution;

import org.junit.jupiter.api.Test;

/**
 * 二进制中1的个数
 *一个二进制数1100，从右边数起第三位是处于最右边的一个1。减去1后，第三位变
 * 成0，它后面的两位0变成了1，而前面的1保持不变，因此得到的结果是1011.我们发现减1的结
 * 果是把最右边的一个1开始的所有位都取反了。这个时候如果我们再把原来的整数和减去1之后的
 * 结果做与运算，从原来整数最右边一个1那一位开始所有位都会变成0。如1100&1011=1000.也
 * 就是说，把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数
 * 的二进制有多少个1，就可以进行多少次这样的操作
 */
public class Solution_11 {

    public int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            ++count;
            n = n & (n - 1);
        }
        return count;
    }

    //将一个数转换成二进制数
//    private  String NumberOf1(int n) {
//        StringBuilder sBuilder = new StringBuilder();
//        for (int i = 0; i < 32; i++){
//            sBuilder.append(n & 1);
//            n = n >>> 1;
//        }
//        int index = sBuilder.reverse().indexOf("1");
//        return sBuilder.substring(index);
//    }
//
//    @Test
//    public void intToBinary(){
//        int[] arr = {9, -9, 100, -100};
//        for (int num : arr){
//            System.out.println(num);
//            System.out.println(NumberOf1(num));
//            System.out.println("----------------------");
//        }
//    }

}
