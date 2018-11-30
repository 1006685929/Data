package Solution2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hxk
 * 2018/11/30 16:21
 * 字符串中的第一个唯一字符
 */

public class Leetcode_387 {
    public static int firstUniqChar(String s) {
        if(null == s || 0 == s.length()){
            return -1;
        }
        int[] hash = new int[26];
        char[] array = s.toCharArray();//s转为字符数组
        for(int i = 0; i < array.length; i++){
            int num = array[i] - 'a';  //表示这个字母在26个字母中所在的位置
            hash[num]++;
        }
        for(int i = 0; i < array.length; i++){//从字符串出发
            int num = array[i] - 'a';
            if(hash[num] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar(s);

    }

}
