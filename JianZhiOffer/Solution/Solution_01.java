package Solution;

/**
 *二维数组保存的是一维数组
 *把每一行看成有序递增的数组，
 *利用二分查找，
 *通过遍历每一行得到答案，
 */
public class Solution_01 {


    public boolean Find(int target,int[][] array){
        if (array == null||array[0].length ==0){
            return false;
        }
        for (int i=0;i<array.length;i++){
            int l = 0;
            int r = array[i].length-1;
            while (l<=r){
                int mid = (l+r)/2;
                if (target<array[i][mid]){
                    r = mid-1;
                }else if (target>array[i][mid]){
                    l = mid+1;
                }else {         //   target=array[i][mid]
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,44,1},{4,4,5}};
        Solution_01 s = new Solution_01();
       if (s.Find(3,arr)){
           System.out.println("有");
       }else {
           System.out.println("么有");
       }
    }


}
