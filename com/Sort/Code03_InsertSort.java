package Sort;

public class Code03_InsertSort {

    public static void insertSort(int[] arr){
        
        if (arr == null){
            return;
        }
        for(int i=1;i<arr.length-1;i++){
            for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }

    }

    private static void swap(int[] arr, int j, int i) {

    }
}
