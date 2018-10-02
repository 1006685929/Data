package Sort;

/**
 * 荷兰国旗问题，，给一个数组 和一个num  小于num的放数组左边，大于的放右边
 *    Less            more
 *       ([         ])
 *        L         R
 *        cur不断移动
 *
 *        小于是cur++，大于时不++
 *        因为小于时小于边界的下一位确定的是==
 *        大于时--交换后不知道大于部分前一位时具体什么数字，所以应该再和num比较后处理
 */
public class Cod06_heLanguoqi {

    public static int[] partition(int[] arr,int L,int R,int num){
        //将数组分为三部分小于  等于    大于    L到R为等于部分
        int Less = L-1;//小于num的放L左边
        int more = R+1;//大于部分在右边
        int cur = L;
        while (cur<more){
            if (arr[cur]<num){//需要放左边且小于空间+1
                swap(arr,++Less,cur++);//++Less表示小于空间的下一位和cur位置交换
            }else if (arr[cur]>num ){
                swap(arr,--more,cur);
            }else {//==num
                cur++;
            }
        }
        return new int[] {Less+1,more-1};//返回等于部分

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }
}
