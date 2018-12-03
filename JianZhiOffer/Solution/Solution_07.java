package Solution;

/**
 * 斐波那契数列
 * 0 1 1 2 3 5
 */
public class Solution_07 {

    public static int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int first = 1;//前一个数
        int second = 1;//第二个数
        int sum = 1;
        for(int i=3;i<=n;i++){
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Solution_07.Fibonacci(6);

    }
}
