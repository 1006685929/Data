package Solution2;

/**
 * Created by hxk
 * 2018/11/27 15:35
 */

public class Leetcode_151 {
    public static String reverseWords(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        if (s.trim().length() == 0){ //对于只有空格的情况，则去除所有空格，返回即可
            return s.trim();
        }
        s = s.trim();//删除任何前导和尾随空格
        String ss[] = s.split(" "); //通过空格分隔
        String newS = "";
        for (int i=ss.length-1;i>=0;i--){
            if (ss[i].equals("")){  //句子中可能会有多余空格
                continue;
            }
            newS = newS+ss[i]+" ";
        }
        //newS = newS+ss[0];
        System.out.println(newS);
        return newS;
    }

    public static void main(String[] args) {
        String s = " the sky       is  blue ";
        Leetcode_151.reverseWords(s);
    }
}
