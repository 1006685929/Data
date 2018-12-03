package Solution;

/**
 * 数值的整数次方
 * 快速幂：将幂指数b转换为二进制，例：6对应二进制为110
 * 此时ab =a4*a2*a0，时间复杂度为f（n）=lgn
 */
public class Solution_12 {

        public static double Power(double base, int exponent) {
            double res = 1.0;
            if (base == 0)
                return 0;
            if (exponent == 0)
                return 1;
            if (exponent < 0)
                base = 1.0 / base;
            while (exponent!=0){
                res *= base;
                exponent = (exponent>0) ? (--exponent) : (++exponent);
            }
            System.out.println(res);
            return res;
        }

        //常规思路
    public static double Power2(double base, int exponent){
        double  result=1;
        if (exponent == 0){
            return 1;
        }
        if (base == 0){
            return 0;
        }
        if (base < 0){
            base = 1.0/base;
        }
        //负数取它的绝对值
        for(int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }
        if(exponent<0){
            result=1/result;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Power(2,-3);
        Power2(2,-3);
    }

}
