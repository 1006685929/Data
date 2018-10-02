package DiGui;

public class test {

    /**
     * 理解递归
     * 含分治思想
     * 将数组分成来两块，分别找到两边最大的比较，其中之一就是最大的
     * 压入栈  再拿出
     */
    public static int getMax(int[] arr,int L,int R){

        //判断终止条件，找到最大值
        if (L==R){
            return arr[L];
        }
        int mid = (L+R)/2;
        int maxtLeft = getMax(arr,L,mid);//   （0-3）    （0-1）   （0-0）
        int maxRigth = getMax(arr,mid+1,R);
        return Math.max(maxtLeft,maxRigth);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,2,4,6,7,3};
        System.out.println(getMax(arr,0,arr.length-1));
    }
}
