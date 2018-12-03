package Solution;

import java.util.ArrayList;

/**
 * Created by hxk
 * 2018/10/21 17:29
 */

public class Solution {

//    public int Fibonacci(int n) {
//        if (n==0){
//            return 0;
//        }
//        if (n<=2){
//            return 1;
//        }
//        return Fibonacci(n-1)+Fibonacci(n-2);
//    }

    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int first = 1;
        int second = 1;
        int sum = 1;
        for(int i=3;i<=n;i++){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
