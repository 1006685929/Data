package Solution;

import java.util.ArrayList;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 准备两个数组，一个放奇数，一个放偶数
 * 将偶数数组加到奇数数组上
 */
public class Solution_13 {

    public void reOrderArray(int [] array) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        if (array == null){
            return;
        }
        for (int i=0;i<array.length;i++){
        if (array[i]%2==1){
            list1.add(array[i]);
        }else {
            list2.add(array[i]);
        }
        }
        list1.addAll(list2);
        for (int i=0;i<array.length;i++){
            array[i] = list1.get(i);
        }
    }
}
