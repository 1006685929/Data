package Solution2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by hxk
 * 2018/11/1 18:57
 */

public class LeetCode_378 {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2){
                    return -1;
                }else if (o1<o2){
                    return 1;
                }
                return 0;
            }
        });
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (heap.size()<k){
                    heap.offer(matrix[i][j]);
                }else {
                    if (heap.peek()>matrix[i][j]){
                        heap.poll();
                        heap.offer(matrix[i][j]);
                    }
                }
            }
        }
        return heap.peek();
    }

}
