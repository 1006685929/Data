package Solution2;

/**
 * Created by hxk
 * 2018/10/21 16:16
 */

public class LeetCode_242 {

    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        char[] charS = s.toCharArray();//转化为字符数组
        char[] charT = t.toCharArray();
        if(s.length()!=t.length()) return false;
        for(char c : charS){
            map[c-'a']++;
        }
        for(char c : charT){
            if(map[c-'a']-- == 0){
                return false;
            }
        }
        return true;
    }
}
