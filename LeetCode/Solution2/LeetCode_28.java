package Solution2;

/**
 * Created by hxk
 * 2018/11/23 17:51
 *
 */

public class LeetCode_28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null && needle == null){
            return 0;
        }
        boolean flag = false;
        for(int i=0;i<haystack.length();i++){
            if (haystack.indexOf(i) == needle.indexOf(0)){
                flag = true;
                compare();
            }
            return -1;
        }
        return 0;
    }

    private void compare() {

    }
}
