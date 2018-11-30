package Solution2;

/**
 * Created by hxk
 * 2018/11/28 19:50
 * 压缩字符串
 */

public class Leetcode_443 {
    public int compress(char[] chars) {
        int n = chars.length;
        int cur = 0; // 当前处理字符的索引，最后是压缩串的长度
        for(int i = 0; i < n; ) {
            int j = i;
            while(j < n - 1 && chars[j] == chars[j+1]) {// 找相同字符的连续个数
                j++;
            }
            chars[cur++] = chars[i];// 记录当前字符
            if(i != j) {
                String times = (j - i + 1) + "";// 当前字符的连续重复次数
                int tLen = times.length();
                for(int k = 0; k < tLen; k++) {//将字符的重复次数写入原串中，用以压缩字符串
                    chars[cur++] = times.charAt(k);
                }
            }
            i = j + 1;
        }
        return cur;
    }
}
