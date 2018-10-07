package Sort;


import java.util.Arrays;

/**
 * 冒泡排序   时间复杂度O(n*n)
 * 0 - N-1     数据操作 N
 * 0 - N-2     数据操作 N-1
 * 算法复杂度   即等差数列求和   忽略低阶项  an^2+bn+c  ==  0（n^2）
 */
public class Code01_BubbleSort {

    public static void bubbSort(int[] arr){
        if (arr == null){
            return;
        }
        for (int end = arr.length-1;end > 0;end--){
            for (int i = 0;i<end;i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //一个正确的方法
    public static void rightMethod(int[] arr){
        Arrays.sort(arr);
    }

    //随机数组生成器
    public static int[] generateRandomArray(int size,int value){

        //生成长度随机的数组
        int[] arr = new int[(int)((size+1)*Math.random())];
        for(int i=0;i<arr.length;i++){
            //生成随机数   随机数相减
            arr[i] = (int) ((value+1)*Math.random())-(int)(value*Math.random());
        }
        return arr;
    }


    public static void printArray(int[] arr) {
        if (arr ==null){
            return;
        }
        for (int array: arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }

    //结果比较
    private static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null&&arr2 != null||(arr1 != null&&arr2 ==null)){
            return false;
        }
        if (arr1 == null&&arr2 == null){
            return false;
        }
        if (arr1.length !=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }


    //数组拷贝，数组内容一样
    private static int[] copyArray(int[] arr) {
        if (arr == null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            res[i] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int testTime = 50000;
        int Size = 10;
        int Value = 100;
        boolean success = true;
        for (int i=0;i<testTime;i++){
            int[] arr1 = generateRandomArray(Size,Value);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = copyArray(arr1);
            bubbSort(arr1);
            rightMethod(arr2);
            if (!isEqual(arr1,arr2)){
                success = false;
                printArray(arr3);
                break;
            }
        }
        System.out.println(success?"Nice!":"Fuck!");

        int[] arr = generateRandomArray(Size,Value);
        printArray(arr);
        bubbSort(arr);
        printArray(arr);
    }

}
