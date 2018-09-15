package Sort;

import java.util.Arrays;

//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,2,7,1};
        for (int a:arr){
            System.out.print(a);
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("选择排序后："+Arrays.toString(arr));
    }

}
