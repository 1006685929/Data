package Solution;

/**
 *从后往前遍历
 * 遇到空格追加 02%
 * 最后倒序返回输出
 */
public class Solution_02 {

    public String replaceSpace(StringBuffer str) {
        StringBuffer res = new StringBuffer();
        int len = str.length()-1;
        for (int i = len;i>=0;i--){
            if (str.charAt(i) == ' ') {
                res.append("02%");
            }else {
                res.append(str.charAt(i));
            }
        }
        //倒序输出方法
        System.out.println(res.reverse().toString());
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        StringBuffer r = new StringBuffer();
        r.append("We are happy");
        r.toString();
        System.out.println(r);
        Solution_02 s = new Solution_02();
        s.replaceSpace(r);
    }

}
